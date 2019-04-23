// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, et, eq, 
//			bh, bj, er, go

public final class bg extends ep
	implements gg
{

	private bg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void ep()>
		zzjz = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #34  <String "">
	//    4    7:putfield        #36  <Field String zzjz>
	//    5   10:return          
	}

	private final void a(int i)
	{
		zziq = zziq | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int zziq>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #39  <Field int zziq>
		zzkc = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #41  <Field int zzkc>
	//    9   16:return          
	}

	static void a(bg bg1, int i)
	{
		bg1.a(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #44  <Method void a(int)>
	//    3    5:return          
	}

	static void a(bg bg1, String s)
	{
		bg1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void a(String)>
	//    3    5:return          
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
	//    4    6:getfield        #39  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #39  <Field int zziq>
			zzjz = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #36  <Field String zzjz>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #50  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #51  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static bh b()
	{
		return (bh)(eq)((ep) (zzkf)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #26  <Field bg zzkf>
	//    1    3:getstatic       #58  <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #61  <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #63  <Class eq>
	//    6   14:checkcast       #65  <Class bh>
	//    7   17:areturn         
	}

	static void b(bg bg1, int i)
	{
		bg1.c(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #68  <Method void c(int)>
	//    3    5:return          
	}

	public static bg c()
	{
		return zzkf;
	//    0    0:getstatic       #26  <Field bg zzkf>
	//    1    3:areturn         
	}

	private final void c(int i)
	{
		zziq = zziq | 0x10;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int zziq>
	//    3    5:bipush          16
	//    4    7:ior             
	//    5    8:putfield        #39  <Field int zziq>
		zzkd = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #71  <Field int zzkd>
	//    9   16:return          
	}

	static void c(bg bg1, int i)
	{
		bg1.d(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #74  <Method void d(int)>
	//    3    5:return          
	}

	static bg d()
	{
		return zzkf;
	//    0    0:getstatic       #26  <Field bg zzkf>
	//    1    3:areturn         
	}

	private final void d(int i)
	{
		zziq = zziq | 0x20;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int zziq>
	//    3    5:bipush          32
	//    4    7:ior             
	//    5    8:putfield        #39  <Field int zziq>
		zzke = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #76  <Field int zzke>
	//    9   16:return          
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bj.a[i - 1];
	//    0    0:getstatic       #81  <Field int[] bj.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 175
	//	               2 166
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #83  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #84  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #90  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #92  <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/bg;
	//   19   71:ldc1            #2   <Class bg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #92  <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzkf)))));
	//   27   84:new             #94  <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #26  <Field bg zzkf>
	//   30   91:invokespecial   #97  <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #92  <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/bg;
	//   34   99:ldc1            #2   <Class bg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/bg;
	//   39  105:ldc1            #2   <Class bg>
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
		return ((Object) (zzkf));
	//   45  112:getstatic       #26  <Field bg zzkf>
	//   46  115:areturn         
_L4:
		return a(((gd) (zzkf)), "\001\006\000\001\001\006\006\000\000\000\001\b\000\002\004\001\003\004\003\004\004\004\005\004\005\006\004\002", new Object[] {
			"zziq", "zzjz", "zzka", "zzkc", "zzkd", "zzke", "zzkb"
		});
	//   47  116:getstatic       #26  <Field bg zzkf>
	//   48  119:ldc1            #99  <String "\001\006\000\001\001\006\006\000\000\000\001\b\000\002\004\001\003\004\003\004\004\004\005\004\005\006\004\002">
	//   49  121:bipush          7
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #102 <String "zziq">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #103 <String "zzjz">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #104 <String "zzka">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #105 <String "zzkc">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #106 <String "zzkd">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #107 <String "zzke">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #108 <String "zzkb">
	//   78  161:aastore         
	//   79  162:invokestatic    #111 <Method Object a(gd, String, Object[])>
	//   80  165:areturn         
_L3:
		return ((Object) (new bh(((bj) (null)))));
	//   81  166:new             #65  <Class bh>
	//   82  169:dup             
	//   83  170:aconst_null     
	//   84  171:invokespecial   #114 <Method void bh(bj)>
	//   85  174:areturn         
_L2:
		return ((Object) (new bg()));
	//   86  175:new             #2   <Class bg>
	//   87  178:dup             
	//   88  179:invokespecial   #24  <Method void bg()>
	//   89  182:areturn         
	}

	public final boolean a()
	{
		return (zziq & 0x10) == 16;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zziq>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:bipush          16
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static volatile go zziv;
	private static final bg zzkf;
	private int zziq;
	private String zzjz;
	private int zzka;
	private int zzkb;
	private int zzkc;
	private int zzkd;
	private int zzke;

	static 
	{
		zzkf = new bg();
	//    0    0:new             #2   <Class bg>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void bg()>
	//    3    7:putstatic       #26  <Field bg zzkf>
		ep.a(com/google/android/gms/internal/firebase-perf/bg, ((ep) (zzkf)));
	//    4   10:ldc1            #2   <Class bg>
	//    5   12:getstatic       #26  <Field bg zzkf>
	//    6   15:invokestatic    #30  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
