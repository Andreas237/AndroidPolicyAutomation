// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, fx, eq, 
//			an, ax, et, au, 
//			aw, er, av, go, 
//			bn, cz, ao

public final class at extends ep
	implements gg
{

	private at()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void ep()>
		zzjg = fx.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #42  <Method fx fx.a()>
	//    4    8:putfield        #44  <Field fx zzjg>
		zzja = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #46  <String "">
	//    7   14:putfield        #48  <Field String zzja>
		zzjb = "";
	//    8   17:aload_0         
	//    9   18:ldc1            #46  <String "">
	//   10   20:putfield        #50  <Field String zzjb>
	//   11   23:return          
	}

	static Map a(at at1)
	{
		return at1.i();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method Map i()>
	//    2    4:areturn         
	}

	private final void a(ao ao)
	{
		zzjc = (an)(ep)((eq) (ao)).l();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method gd eq.l()>
	//    3    5:checkcast       #4   <Class ep>
	//    4    8:checkcast       #64  <Class an>
	//    5   11:putfield        #66  <Field an zzjc>
		zziq = zziq | 4;
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field int zziq>
	//    9   19:iconst_4        
	//   10   20:ior             
	//   11   21:putfield        #68  <Field int zziq>
	//   12   24:return          
	}

	static void a(at at1, ao ao)
	{
		at1.a(ao);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #71  <Method void a(ao)>
	//    3    5:return          
	}

	static void a(at at1, ax ax1)
	{
		at1.a(ax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #75  <Method void a(ax)>
	//    3    5:return          
	}

	static void a(at at1, String s)
	{
		at1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #79  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(ax ax1)
	{
		if(ax1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			zziq = zziq | 0x20;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int zziq>
	//    5    9:bipush          32
	//    6   11:ior             
	//    7   12:putfield        #68  <Field int zziq>
			zzjf = ax1.a();
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #84  <Method int ax.a()>
	//   11   20:putfield        #86  <Field int zzjf>
			return;
	//   12   23:return          
		} else
		{
			throw new NullPointerException();
	//   13   24:new             #88  <Class NullPointerException>
	//   14   27:dup             
	//   15   28:invokespecial   #89  <Method void NullPointerException()>
	//   16   31:athrow          
		}
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
	//    4    6:getfield        #68  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #68  <Field int zziq>
			zzja = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #48  <Field String zzja>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #88  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #89  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static void b(at at1, String s)
	{
		at1.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void b(String)>
	//    3    5:return          
	}

	private final void b(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #68  <Field int zziq>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #68  <Field int zziq>
			zzjb = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #50  <Field String zzjb>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #88  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #89  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static au f()
	{
		return (au)(eq)((ep) (zzjh)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #31  <Field at zzjh>
	//    1    3:getstatic       #99  <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #102 <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #58  <Class eq>
	//    6   14:checkcast       #104 <Class au>
	//    7   17:areturn         
	}

	public static at g()
	{
		return zzjh;
	//    0    0:getstatic       #31  <Field at zzjh>
	//    1    3:areturn         
	}

	static at h()
	{
		return zzjh;
	//    0    0:getstatic       #31  <Field at zzjh>
	//    1    3:areturn         
	}

	private final Map i()
	{
		if(!zzjg.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field fx zzjg>
	//*   2    4:invokevirtual   #111 <Method boolean fx.d()>
	//*   3    7:ifne            21
			zzjg = zzjg.b();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field fx zzjg>
	//    7   15:invokevirtual   #113 <Method fx fx.b()>
	//    8   18:putfield        #44  <Field fx zzjg>
		return ((Map) (zzjg));
	//    9   21:aload_0         
	//   10   22:getfield        #44  <Field fx zzjg>
	//   11   25:areturn         
	}

	protected final Object a(int j, Object obj, Object obj1)
	{
		aw.a[j - 1];
	//    0    0:getstatic       #118 <Field int[] aw.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 199
	//	               2 190
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 199
	//	               2 190
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #120 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #121 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #127 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #129 <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/at;
	//   19   71:ldc1            #2   <Class at>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #129 <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzjh)))));
	//   27   84:new             #131 <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #31  <Field at zzjh>
	//   30   91:invokespecial   #134 <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #129 <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/at;
	//   34   99:ldc1            #2   <Class at>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/at;
	//   39  105:ldc1            #2   <Class at>
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
		return ((Object) (zzjh));
	//   45  112:getstatic       #31  <Field at zzjh>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ax.b()));
	//   47  116:invokestatic    #137 <Method ey ax.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (av.a));
	//   49  120:getstatic       #142 <Field fv av.a>
	//   50  123:astore_3        
		return a(((gd) (zzjh)), "\001\007\000\001\001\007\007\001\000\000\001\b\000\002\b\001\003\t\002\004\t\003\005\f\005\0062\007\t\004", new Object[] {
			"zziq", "zzja", "zzjb", "zzjc", "zzjd", "zzjf", obj, "zzjg", obj1, "zzje"
		});
	//   51  124:getstatic       #31  <Field at zzjh>
	//   52  127:ldc1            #144 <String "\001\007\000\001\001\007\007\001\000\000\001\b\000\002\b\001\003\t\002\004\t\003\005\f\005\0062\007\t\004">
	//   53  129:bipush          10
	//   54  131:anewarray       Object[]
	//   55  134:dup             
	//   56  135:iconst_0        
	//   57  136:ldc1            #147 <String "zziq">
	//   58  138:aastore         
	//   59  139:dup             
	//   60  140:iconst_1        
	//   61  141:ldc1            #148 <String "zzja">
	//   62  143:aastore         
	//   63  144:dup             
	//   64  145:iconst_2        
	//   65  146:ldc1            #149 <String "zzjb">
	//   66  148:aastore         
	//   67  149:dup             
	//   68  150:iconst_3        
	//   69  151:ldc1            #150 <String "zzjc">
	//   70  153:aastore         
	//   71  154:dup             
	//   72  155:iconst_4        
	//   73  156:ldc1            #151 <String "zzjd">
	//   74  158:aastore         
	//   75  159:dup             
	//   76  160:iconst_5        
	//   77  161:ldc1            #152 <String "zzjf">
	//   78  163:aastore         
	//   79  164:dup             
	//   80  165:bipush          6
	//   81  167:aload_2         
	//   82  168:aastore         
	//   83  169:dup             
	//   84  170:bipush          7
	//   85  172:ldc1            #153 <String "zzjg">
	//   86  174:aastore         
	//   87  175:dup             
	//   88  176:bipush          8
	//   89  178:aload_3         
	//   90  179:aastore         
	//   91  180:dup             
	//   92  181:bipush          9
	//   93  183:ldc1            #154 <String "zzje">
	//   94  185:aastore         
	//   95  186:invokestatic    #157 <Method Object a(gd, String, Object[])>
	//   96  189:areturn         
_L3:
		return ((Object) (new au(((aw) (null)))));
	//   97  190:new             #104 <Class au>
	//   98  193:dup             
	//   99  194:aconst_null     
	//  100  195:invokespecial   #160 <Method void au(aw)>
	//  101  198:areturn         
_L2:
		return ((Object) (new at()));
	//  102  199:new             #2   <Class at>
	//  103  202:dup             
	//  104  203:invokespecial   #29  <Method void at()>
	//  105  206:areturn         
	}

	public final boolean a()
	{
		return (zziq & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zziq>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean b()
	{
		return (zziq & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zziq>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean c()
	{
		return (zziq & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zziq>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final an d()
	{
		an an2 = zzjc;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field an zzjc>
	//    2    4:astore_2        
		an an1 = an2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(an2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			an1 = an.d();
	//    7   11:invokestatic    #164 <Method an an.d()>
	//    8   14:astore_1        
		return an1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final boolean e()
	{
		return (zziq & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zziq>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static volatile go zziv;
	private static final at zzjh;
	private int zziq;
	private String zzja;
	private String zzjb;
	private an zzjc;
	private bn zzjd;
	private cz zzje;
	private int zzjf;
	private fx zzjg;

	static 
	{
		zzjh = new at();
	//    0    0:new             #2   <Class at>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void at()>
	//    3    7:putstatic       #31  <Field at zzjh>
		ep.a(com/google/android/gms/internal/firebase-perf/at, ((ep) (zzjh)));
	//    4   10:ldc1            #2   <Class at>
	//    5   12:getstatic       #31  <Field at zzjh>
	//    6   15:invokestatic    #35  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
