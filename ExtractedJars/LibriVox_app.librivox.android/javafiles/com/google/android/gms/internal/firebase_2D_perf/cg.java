// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, ci, ez, 
//			cn, et, eq, ch, 
//			fa, cj, er, go

public final class cg extends ep
	implements gg
{

	private cg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void ep()>
		zzkg = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <String "">
	//    4    7:putfield        #40  <Field String zzkg>
		zzlz = B();
	//    5   10:aload_0         
	//    6   11:invokestatic    #44  <Method ez B()>
	//    7   14:putfield        #46  <Field ez zzlz>
	//    8   17:return          
	}

	static void a(cg cg1, cn cn1)
	{
		cg1.a(cn1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void a(cn)>
	//    3    5:return          
	}

	static void a(cg cg1, String s)
	{
		cg1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(cn cn1)
	{
		if(cn1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          67
		{
			if(!zzlz.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field ez zzlz>
	//*   4    8:invokeinterface #59  <Method boolean ez.a()>
	//*   5   13:ifne            53
			{
				ez ez1 = zzlz;
	//    6   16:aload_0         
	//    7   17:getfield        #46  <Field ez zzlz>
	//    8   20:astore_3        
				int i = ez1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #63  <Method int ez.size()>
	//   11   27:istore_2        
				if(i == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					i = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					i <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzlz = ez1.a(i);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #66  <Method ez ez.a(int)>
	//   25   50:putfield        #46  <Field ez zzlz>
			}
			zzlz.c(cn1.a());
	//   26   53:aload_0         
	//   27   54:getfield        #46  <Field ez zzlz>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #70  <Method int cn.a()>
	//   30   61:invokeinterface #74  <Method void ez.c(int)>
			return;
	//   31   66:return          
		} else
		{
			throw new NullPointerException();
	//   32   67:new             #76  <Class NullPointerException>
	//   33   70:dup             
	//   34   71:invokespecial   #77  <Method void NullPointerException()>
	//   35   74:athrow          
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
	//    4    6:getfield        #79  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #79  <Field int zziq>
			zzkg = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #40  <Field String zzkg>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #76  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #77  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static ch b()
	{
		return (ch)(eq)((ep) (zzmb)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #30  <Field cg zzmb>
	//    1    3:getstatic       #86  <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #89  <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #91  <Class eq>
	//    6   14:checkcast       #93  <Class ch>
	//    7   17:areturn         
	}

	static cg c()
	{
		return zzmb;
	//    0    0:getstatic       #30  <Field cg zzmb>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzlz.size();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field ez zzlz>
	//    2    4:invokeinterface #63  <Method int ez.size()>
	//    3    9:ireturn         
	}

	public final cn a(int i)
	{
		return (cn)zzma.a(((Object) (Integer.valueOf(zzlz.b(0)))));
	//    0    0:getstatic       #27  <Field fa zzma>
	//    1    3:aload_0         
	//    2    4:getfield        #46  <Field ez zzlz>
	//    3    7:iconst_0        
	//    4    8:invokeinterface #98  <Method int ez.b(int)>
	//    5   13:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//    6   16:invokeinterface #109 <Method Object fa.a(Object)>
	//    7   21:checkcast       #68  <Class cn>
	//    8   24:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		cj.a[i - 1];
	//    0    0:getstatic       #114 <Field int[] cj.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 161
	//	               2 152
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 161
	//	               2 152
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #116 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #117 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #122 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #124 <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/cg;
	//   19   71:ldc1            #2   <Class cg>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #124 <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzmb)))));
	//   27   84:new             #126 <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field cg zzmb>
	//   30   91:invokespecial   #129 <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #124 <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/cg;
	//   34   99:ldc1            #2   <Class cg>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/cg;
	//   39  105:ldc1            #2   <Class cg>
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
		return ((Object) (zzmb));
	//   45  112:getstatic       #30  <Field cg zzmb>
	//   46  115:areturn         
_L4:
		obj = ((Object) (cn.b()));
	//   47  116:invokestatic    #132 <Method ey cn.b()>
	//   48  119:astore_2        
		return a(((gd) (zzmb)), "\001\002\000\001\001\002\002\000\001\000\001\b\000\002\036", new Object[] {
			"zziq", "zzkg", "zzlz", obj
		});
	//   49  120:getstatic       #30  <Field cg zzmb>
	//   50  123:ldc1            #134 <String "\001\002\000\001\001\002\002\000\001\000\001\b\000\002\036">
	//   51  125:iconst_4        
	//   52  126:anewarray       Object[]
	//   53  129:dup             
	//   54  130:iconst_0        
	//   55  131:ldc1            #137 <String "zziq">
	//   56  133:aastore         
	//   57  134:dup             
	//   58  135:iconst_1        
	//   59  136:ldc1            #138 <String "zzkg">
	//   60  138:aastore         
	//   61  139:dup             
	//   62  140:iconst_2        
	//   63  141:ldc1            #139 <String "zzlz">
	//   64  143:aastore         
	//   65  144:dup             
	//   66  145:iconst_3        
	//   67  146:aload_2         
	//   68  147:aastore         
	//   69  148:invokestatic    #142 <Method Object a(gd, String, Object[])>
	//   70  151:areturn         
_L3:
		return ((Object) (new ch(((ci) (null)))));
	//   71  152:new             #93  <Class ch>
	//   72  155:dup             
	//   73  156:aconst_null     
	//   74  157:invokespecial   #145 <Method void ch(ci)>
	//   75  160:areturn         
_L2:
		return ((Object) (new cg()));
	//   76  161:new             #2   <Class cg>
	//   77  164:dup             
	//   78  165:invokespecial   #28  <Method void cg()>
	//   79  168:areturn         
	}

	private static volatile go zziv;
	private static final fa zzma = new ci();
	private static final cg zzmb;
	private int zziq;
	private String zzkg;
	private ez zzlz;

	static 
	{
	//    0    0:new             #22  <Class ci>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ci()>
	//    3    7:putstatic       #27  <Field fa zzma>
		zzmb = new cg();
	//    4   10:new             #2   <Class cg>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void cg()>
	//    7   17:putstatic       #30  <Field cg zzmb>
		ep.a(com/google/android/gms/internal/firebase-perf/cg, ((ep) (zzmb)));
	//    8   20:ldc1            #2   <Class cg>
	//    9   22:getstatic       #30  <Field cg zzmb>
	//   10   25:invokestatic    #34  <Method void ep.a(Class, ep)>
	//*  11   28:return          
	}
}
