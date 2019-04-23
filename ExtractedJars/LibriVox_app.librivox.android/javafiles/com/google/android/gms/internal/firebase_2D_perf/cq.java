// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, fx, fb, 
//			dc, et, eq, cr, 
//			cu, er, cs, ct, 
//			cg, go

public final class cq extends ep
	implements gg
{

	private cq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void ep()>
		zzmn = fx.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #43  <Method fx fx.a()>
	//    4    8:putfield        #45  <Field fx zzmn>
		zzjg = fx.a();
	//    5   11:aload_0         
	//    6   12:invokestatic    #43  <Method fx fx.a()>
	//    7   15:putfield        #47  <Field fx zzjg>
		zzmk = "";
	//    8   18:aload_0         
	//    9   19:ldc1            #49  <String "">
	//   10   21:putfield        #51  <Field String zzmk>
		zzmo = C();
	//   11   24:aload_0         
	//   12   25:invokestatic    #55  <Method fb C()>
	//   13   28:putfield        #57  <Field fb zzmo>
		zzle = C();
	//   14   31:aload_0         
	//   15   32:invokestatic    #55  <Method fb C()>
	//   16   35:putfield        #59  <Field fb zzle>
	//   17   38:return          
	}

	static Map a(cq cq1)
	{
		return cq1.l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method Map l()>
	//    2    4:areturn         
	}

	private final void a(long l1)
	{
		zziq = zziq | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field int zziq>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #67  <Field int zziq>
		zzla = l1;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #69  <Field long zzla>
	//    9   15:return          
	}

	private final void a(cg cg1)
	{
		if(cg1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzle.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #59  <Field fb zzle>
	//*   4    8:invokeinterface #75  <Method boolean fb.a()>
	//*   5   13:ifne            53
			{
				fb fb1 = zzle;
	//    6   16:aload_0         
	//    7   17:getfield        #59  <Field fb zzle>
	//    8   20:astore_3        
				int i1 = fb1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #79  <Method int fb.size()>
	//   11   27:istore_2        
				if(i1 == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					i1 = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					i1 <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzle = fb1.d(i1);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #83  <Method fb fb.d(int)>
	//   25   50:putfield        #59  <Field fb zzle>
			}
			zzle.add(((Object) (cg1)));
	//   26   53:aload_0         
	//   27   54:getfield        #59  <Field fb zzle>
	//   28   57:aload_1         
	//   29   58:invokeinterface #87  <Method boolean fb.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #89  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #90  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	static void a(cq cq1, long l1)
	{
		cq1.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #93  <Method void a(long)>
	//    3    5:return          
	}

	static void a(cq cq1, cg cg1)
	{
		cq1.a(cg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void a(cg)>
	//    3    5:return          
	}

	static void a(cq cq1, cq cq2)
	{
		cq1.d(cq2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #100 <Method void d(cq)>
	//    3    5:return          
	}

	static void a(cq cq1, Iterable iterable)
	{
		cq1.a(iterable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method void a(Iterable)>
	//    3    5:return          
	}

	static void a(cq cq1, String s)
	{
		cq1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #108 <Method void a(String)>
	//    3    5:return          
	}

	private final void a(Iterable iterable)
	{
		if(!zzmo.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field fb zzmo>
	//*   2    4:invokeinterface #75  <Method boolean fb.a()>
	//*   3    9:ifne            49
		{
			fb fb1 = zzmo;
	//    4   12:aload_0         
	//    5   13:getfield        #57  <Field fb zzmo>
	//    6   16:astore_3        
			int i1 = fb1.size();
	//    7   17:aload_3         
	//    8   18:invokeinterface #79  <Method int fb.size()>
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
			zzmo = fb1.d(i1);
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:iload_2         
	//   22   41:invokeinterface #83  <Method fb fb.d(int)>
	//   23   46:putfield        #57  <Field fb zzmo>
		}
		dc.a(iterable, ((List) (zzmo)));
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:getfield        #57  <Field fb zzmo>
	//   27   54:invokestatic    #113 <Method void dc.a(Iterable, List)>
	//   28   57:return          
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #67  <Field int zziq>
			zzmk = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #51  <Field String zzmk>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #89  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #90  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static Map b(cq cq1)
	{
		return cq1.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method Map m()>
	//    2    4:areturn         
	}

	private final void b(long l1)
	{
		zziq = zziq | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field int zziq>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #67  <Field int zziq>
		zzmm = l1;
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:putfield        #119 <Field long zzmm>
	//    9   16:return          
	}

	static void b(cq cq1, long l1)
	{
		cq1.b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #121 <Method void b(long)>
	//    3    5:return          
	}

	static void b(cq cq1, Iterable iterable)
	{
		cq1.b(iterable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void b(Iterable)>
	//    3    5:return          
	}

	private final void b(Iterable iterable)
	{
		if(!zzle.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field fb zzle>
	//*   2    4:invokeinterface #75  <Method boolean fb.a()>
	//*   3    9:ifne            49
		{
			fb fb1 = zzle;
	//    4   12:aload_0         
	//    5   13:getfield        #59  <Field fb zzle>
	//    6   16:astore_3        
			int i1 = fb1.size();
	//    7   17:aload_3         
	//    8   18:invokeinterface #79  <Method int fb.size()>
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
	//   22   41:invokeinterface #83  <Method fb fb.d(int)>
	//   23   46:putfield        #59  <Field fb zzle>
		}
		dc.a(iterable, ((List) (zzle)));
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:getfield        #59  <Field fb zzle>
	//   27   54:invokestatic    #113 <Method void dc.a(Iterable, List)>
	//   28   57:return          
	}

	static void c(cq cq1)
	{
		cq1.n();
	//    0    0:aload_0         
	//    1    1:invokespecial   #127 <Method void n()>
	//    2    4:return          
	}

	private final void d(cq cq1)
	{
		if(cq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzmo.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #57  <Field fb zzmo>
	//*   4    8:invokeinterface #75  <Method boolean fb.a()>
	//*   5   13:ifne            53
			{
				fb fb1 = zzmo;
	//    6   16:aload_0         
	//    7   17:getfield        #57  <Field fb zzmo>
	//    8   20:astore_3        
				int i1 = fb1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #79  <Method int fb.size()>
	//   11   27:istore_2        
				if(i1 == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					i1 = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					i1 <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzmo = fb1.d(i1);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #83  <Method fb fb.d(int)>
	//   25   50:putfield        #57  <Field fb zzmo>
			}
			zzmo.add(((Object) (cq1)));
	//   26   53:aload_0         
	//   27   54:getfield        #57  <Field fb zzmo>
	//   28   57:aload_1         
	//   29   58:invokeinterface #87  <Method boolean fb.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #89  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #90  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	public static cr i()
	{
		return (cr)(eq)((ep) (zzmp)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #32  <Field cq zzmp>
	//    1    3:getstatic       #134 <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #137 <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #139 <Class eq>
	//    6   14:checkcast       #141 <Class cr>
	//    7   17:areturn         
	}

	public static cq j()
	{
		return zzmp;
	//    0    0:getstatic       #32  <Field cq zzmp>
	//    1    3:areturn         
	}

	static cq k()
	{
		return zzmp;
	//    0    0:getstatic       #32  <Field cq zzmp>
	//    1    3:areturn         
	}

	private final Map l()
	{
		if(!zzmn.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field fx zzmn>
	//*   2    4:invokevirtual   #146 <Method boolean fx.d()>
	//*   3    7:ifne            21
			zzmn = zzmn.b();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field fx zzmn>
	//    7   15:invokevirtual   #148 <Method fx fx.b()>
	//    8   18:putfield        #45  <Field fx zzmn>
		return ((Map) (zzmn));
	//    9   21:aload_0         
	//   10   22:getfield        #45  <Field fx zzmn>
	//   11   25:areturn         
	}

	private final Map m()
	{
		if(!zzjg.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field fx zzjg>
	//*   2    4:invokevirtual   #146 <Method boolean fx.d()>
	//*   3    7:ifne            21
			zzjg = zzjg.b();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field fx zzjg>
	//    7   15:invokevirtual   #148 <Method fx fx.b()>
	//    8   18:putfield        #47  <Field fx zzjg>
		return ((Map) (zzjg));
	//    9   21:aload_0         
	//   10   22:getfield        #47  <Field fx zzjg>
	//   11   25:areturn         
	}

	private final void n()
	{
		zzle = C();
	//    0    0:aload_0         
	//    1    1:invokestatic    #55  <Method fb C()>
	//    2    4:putfield        #59  <Field fb zzle>
	//    3    7:return          
	}

	protected final Object a(int i1, Object obj, Object obj1)
	{
		cu.a[i1 - 1];
	//    0    0:getstatic       #153 <Field int[] cu.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 217
	//	               2 208
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 217
	//	               2 208
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #155 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #156 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #162 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #164 <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/cq;
	//   19   71:ldc1            #2   <Class cq>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #164 <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzmp)))));
	//   27   84:new             #166 <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #32  <Field cq zzmp>
	//   30   91:invokespecial   #169 <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #164 <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/cq;
	//   34   99:ldc1            #2   <Class cq>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/cq;
	//   39  105:ldc1            #2   <Class cq>
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
		return ((Object) (zzmp));
	//   45  112:getstatic       #32  <Field cq zzmp>
	//   46  115:areturn         
_L4:
		obj = ((Object) (cs.a));
	//   47  116:getstatic       #174 <Field fv cs.a>
	//   48  119:astore_2        
		obj1 = ((Object) (ct.a));
	//   49  120:getstatic       #177 <Field fv ct.a>
	//   50  123:astore_3        
		return a(((gd) (zzmp)), "\001\b\000\001\001\t\b\002\002\000\001\b\000\002\007\001\004\002\002\005\002\003\0062\007\033\b2\t\033", new Object[] {
			"zziq", "zzmk", "zzml", "zzla", "zzmm", "zzmn", obj, "zzmo", com/google/android/gms/internal/firebase-perf/cq, "zzjg", 
			obj1, "zzle", com/google/android/gms/internal/firebase-perf/cg
		});
	//   51  124:getstatic       #32  <Field cq zzmp>
	//   52  127:ldc1            #179 <String "\001\b\000\001\001\t\b\002\002\000\001\b\000\002\007\001\004\002\002\005\002\003\0062\007\033\b2\t\033">
	//   53  129:bipush          13
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #182 <String "zziq">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #183 <String "zzmk">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:ldc1            #184 <String "zzml">
	//   66  148:aastore         
	//   67  149:dup             
	//   68  150:iconst_3        
	//   69  151:ldc1            #185 <String "zzla">
	//   70  153:aastore         
	//   71  154:dup             
	//   72  155:iconst_4        
	//   73  156:ldc1            #186 <String "zzmm">
	//   74  158:aastore         
	//   75  159:dup             
	//   76  160:iconst_5        
	//   77  161:ldc1            #187 <String "zzmn">
	//   78  163:aastore         
	//   79  164:dup             
	//   80  165:bipush          6
	//   81  167:aload_2         
	//   82  168:aastore         
	//   83  169:dup             
	//   84  170:bipush          7
	//   85  172:ldc1            #188 <String "zzmo">
	//   86  174:aastore         
	//   87  175:dup             
	//   88  176:bipush          8
	//   89  178:ldc1            #2   <Class cq>
	//   90  180:aastore         
	//   91  181:dup             
	//   92  182:bipush          9
	//   93  184:ldc1            #189 <String "zzjg">
	//   94  186:aastore         
	//   95  187:dup             
	//   96  188:bipush          10
	//   97  190:aload_3         
	//   98  191:aastore         
	//   99  192:dup             
	//  100  193:bipush          11
	//  101  195:ldc1            #190 <String "zzle">
	//  102  197:aastore         
	//  103  198:dup             
	//  104  199:bipush          12
	//  105  201:ldc1            #192 <Class cg>
	//  106  203:aastore         
	//  107  204:invokestatic    #195 <Method Object a(gd, String, Object[])>
	//  108  207:areturn         
_L3:
		return ((Object) (new cr(((cu) (null)))));
	//  109  208:new             #141 <Class cr>
	//  110  211:dup             
	//  111  212:aconst_null     
	//  112  213:invokespecial   #198 <Method void cr(cu)>
	//  113  216:areturn         
_L2:
		return ((Object) (new cq()));
	//  114  217:new             #2   <Class cq>
	//  115  220:dup             
	//  116  221:invokespecial   #30  <Method void cq()>
	//  117  224:areturn         
	}

	public final String a()
	{
		return zzmk;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String zzmk>
	//    2    4:areturn         
	}

	public final boolean b()
	{
		return (zziq & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int zziq>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final long c()
	{
		return zzmm;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field long zzmm>
	//    2    4:lreturn         
	}

	public final int d()
	{
		return zzmn.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field fx zzmn>
	//    2    4:invokevirtual   #201 <Method int fx.size()>
	//    3    7:ireturn         
	}

	public final Map e()
	{
		return Collections.unmodifiableMap(((Map) (zzmn)));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field fx zzmn>
	//    2    4:invokestatic    #207 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public final List f()
	{
		return ((List) (zzmo));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field fb zzmo>
	//    2    4:areturn         
	}

	public final Map g()
	{
		return Collections.unmodifiableMap(((Map) (zzjg)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field fx zzjg>
	//    2    4:invokestatic    #207 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	public final List h()
	{
		return ((List) (zzle));
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field fb zzle>
	//    2    4:areturn         
	}

	private static volatile go zziv;
	private static final cq zzmp;
	private int zziq;
	private fx zzjg;
	private long zzla;
	private fb zzle;
	private String zzmk;
	private boolean zzml;
	private long zzmm;
	private fx zzmn;
	private fb zzmo;

	static 
	{
		zzmp = new cq();
	//    0    0:new             #2   <Class cq>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void cq()>
	//    3    7:putstatic       #32  <Field cq zzmp>
		ep.a(com/google/android/gms/internal/firebase-perf/cq, ((ep) (zzmp)));
	//    4   10:ldc1            #2   <Class cq>
	//    5   12:getstatic       #32  <Field cq zzmp>
	//    6   15:invokestatic    #36  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
