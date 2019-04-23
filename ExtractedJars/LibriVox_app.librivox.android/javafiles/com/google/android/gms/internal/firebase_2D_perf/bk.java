// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, fb, et, 
//			eq, bl, bm, er, 
//			ba, aq, bq, bg, 
//			go

public final class bk extends ep
	implements gg
{

	private bk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void ep()>
		zzkg = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #35  <String "">
	//    4    7:putfield        #37  <Field String zzkg>
		zzki = C();
	//    5   10:aload_0         
	//    6   11:invokestatic    #41  <Method fb C()>
	//    7   14:putfield        #43  <Field fb zzki>
		zzkj = C();
	//    8   17:aload_0         
	//    9   18:invokestatic    #41  <Method fb C()>
	//   10   21:putfield        #45  <Field fb zzkj>
		zzkk = C();
	//   11   24:aload_0         
	//   12   25:invokestatic    #41  <Method fb C()>
	//   13   28:putfield        #47  <Field fb zzkk>
	//   14   31:return          
	}

	private final void a(aq aq1)
	{
		if(aq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzkj.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field fb zzkj>
	//*   4    8:invokeinterface #53  <Method boolean fb.a()>
	//*   5   13:ifne            53
			{
				fb fb1 = zzkj;
	//    6   16:aload_0         
	//    7   17:getfield        #45  <Field fb zzkj>
	//    8   20:astore_3        
				int j = fb1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #57  <Method int fb.size()>
	//   11   27:istore_2        
				if(j == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					j = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					j <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzkj = fb1.d(j);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #61  <Method fb fb.d(int)>
	//   25   50:putfield        #45  <Field fb zzkj>
			}
			zzkj.add(((Object) (aq1)));
	//   26   53:aload_0         
	//   27   54:getfield        #45  <Field fb zzkj>
	//   28   57:aload_1         
	//   29   58:invokeinterface #65  <Method boolean fb.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #67  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #68  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	private final void a(ba ba1)
	{
		if(ba1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			if(!zzki.a())
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field fb zzki>
	//*   4    8:invokeinterface #53  <Method boolean fb.a()>
	//*   5   13:ifne            53
			{
				fb fb1 = zzki;
	//    6   16:aload_0         
	//    7   17:getfield        #43  <Field fb zzki>
	//    8   20:astore_3        
				int j = fb1.size();
	//    9   21:aload_3         
	//   10   22:invokeinterface #57  <Method int fb.size()>
	//   11   27:istore_2        
				if(j == 0)
	//*  12   28:iload_2         
	//*  13   29:ifne            38
					j = 10;
	//   14   32:bipush          10
	//   15   34:istore_2        
				else
	//*  16   35:goto            42
					j <<= 1;
	//   17   38:iload_2         
	//   18   39:iconst_1        
	//   19   40:ishl            
	//   20   41:istore_2        
				zzki = fb1.d(j);
	//   21   42:aload_0         
	//   22   43:aload_3         
	//   23   44:iload_2         
	//   24   45:invokeinterface #61  <Method fb fb.d(int)>
	//   25   50:putfield        #43  <Field fb zzki>
			}
			zzki.add(((Object) (ba1)));
	//   26   53:aload_0         
	//   27   54:getfield        #43  <Field fb zzki>
	//   28   57:aload_1         
	//   29   58:invokeinterface #65  <Method boolean fb.add(Object)>
	//   30   63:pop             
			return;
	//   31   64:return          
		} else
		{
			throw new NullPointerException();
	//   32   65:new             #67  <Class NullPointerException>
	//   33   68:dup             
	//   34   69:invokespecial   #68  <Method void NullPointerException()>
	//   35   72:athrow          
		}
	}

	private final void a(bg bg1)
	{
		if(bg1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzkh = bg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #72  <Field bg zzkh>
			zziq = zziq | 2;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #74  <Field int zziq>
	//    8   14:iconst_2        
	//    9   15:ior             
	//   10   16:putfield        #74  <Field int zziq>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #67  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #68  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static void a(bk bk1, aq aq1)
	{
		bk1.a(aq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #77  <Method void a(aq)>
	//    3    5:return          
	}

	static void a(bk bk1, ba ba1)
	{
		bk1.a(ba1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void a(ba)>
	//    3    5:return          
	}

	static void a(bk bk1, bg bg1)
	{
		bk1.a(bg1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void a(bg)>
	//    3    5:return          
	}

	static void a(bk bk1, String s)
	{
		bk1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void a(String)>
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
	//    4    6:getfield        #74  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #74  <Field int zziq>
			zzkg = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #37  <Field String zzkg>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #67  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #68  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static bl g()
	{
		return (bl)(eq)((ep) (zzkl)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #27  <Field bk zzkl>
	//    1    3:getstatic       #94  <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #97  <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #99  <Class eq>
	//    6   14:checkcast       #101 <Class bl>
	//    7   17:areturn         
	}

	public static bk h()
	{
		return zzkl;
	//    0    0:getstatic       #27  <Field bk zzkl>
	//    1    3:areturn         
	}

	static bk i()
	{
		return zzkl;
	//    0    0:getstatic       #27  <Field bk zzkl>
	//    1    3:areturn         
	}

	protected final Object a(int j, Object obj, Object obj1)
	{
		bm.a[j - 1];
	//    0    0:getstatic       #109 <Field int[] bm.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 187
	//	               2 178
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 187
	//	               2 178
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #111 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #112 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #118 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #120 <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/bk;
	//   19   71:ldc1            #2   <Class bk>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #120 <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzkl)))));
	//   27   84:new             #122 <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #27  <Field bk zzkl>
	//   30   91:invokespecial   #125 <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #120 <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/bk;
	//   34   99:ldc1            #2   <Class bk>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/bk;
	//   39  105:ldc1            #2   <Class bk>
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
		return ((Object) (zzkl));
	//   45  112:getstatic       #27  <Field bk zzkl>
	//   46  115:areturn         
_L4:
		return a(((gd) (zzkl)), "\001\005\000\001\001\005\005\000\003\000\001\b\000\002\033\003\t\001\004\033\005\033", new Object[] {
			"zziq", "zzkg", "zzki", com/google/android/gms/internal/firebase-perf/ba, "zzkh", "zzkj", com/google/android/gms/internal/firebase-perf/aq, "zzkk", com/google/android/gms/internal/firebase-perf/bq
		});
	//   47  116:getstatic       #27  <Field bk zzkl>
	//   48  119:ldc1            #127 <String "\001\005\000\001\001\005\005\000\003\000\001\b\000\002\033\003\t\001\004\033\005\033">
	//   49  121:bipush          9
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #130 <String "zziq">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #131 <String "zzkg">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #132 <String "zzki">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #134 <Class ba>
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #135 <String "zzkh">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #136 <String "zzkj">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #138 <Class aq>
	//   78  161:aastore         
	//   79  162:dup             
	//   80  163:bipush          7
	//   81  165:ldc1            #139 <String "zzkk">
	//   82  167:aastore         
	//   83  168:dup             
	//   84  169:bipush          8
	//   85  171:ldc1            #141 <Class bq>
	//   86  173:aastore         
	//   87  174:invokestatic    #144 <Method Object a(gd, String, Object[])>
	//   88  177:areturn         
_L3:
		return ((Object) (new bl(((bm) (null)))));
	//   89  178:new             #101 <Class bl>
	//   90  181:dup             
	//   91  182:aconst_null     
	//   92  183:invokespecial   #147 <Method void bl(bm)>
	//   93  186:areturn         
_L2:
		return ((Object) (new bk()));
	//   94  187:new             #2   <Class bk>
	//   95  190:dup             
	//   96  191:invokespecial   #25  <Method void bk()>
	//   97  194:areturn         
	}

	public final boolean a()
	{
		return (zziq & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int zziq>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final String b()
	{
		return zzkg;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzkg>
	//    2    4:areturn         
	}

	public final boolean c()
	{
		return (zziq & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int zziq>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final bg d()
	{
		bg bg2 = zzkh;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field bg zzkh>
	//    2    4:astore_2        
		bg bg1 = bg2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(bg2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			bg1 = bg.c();
	//    7   11:invokestatic    #155 <Method bg bg.c()>
	//    8   14:astore_1        
		return bg1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final int e()
	{
		return zzki.size();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field fb zzki>
	//    2    4:invokeinterface #57  <Method int fb.size()>
	//    3    9:ireturn         
	}

	public final int f()
	{
		return zzkj.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field fb zzkj>
	//    2    4:invokeinterface #57  <Method int fb.size()>
	//    3    9:ireturn         
	}

	private static volatile go zziv;
	private static final bk zzkl;
	private int zziq;
	private String zzkg;
	private bg zzkh;
	private fb zzki;
	private fb zzkj;
	private fb zzkk;

	static 
	{
		zzkl = new bk();
	//    0    0:new             #2   <Class bk>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void bk()>
	//    3    7:putstatic       #27  <Field bk zzkl>
		ep.a(com/google/android/gms/internal/firebase-perf/bk, ((ep) (zzkl)));
	//    4   10:ldc1            #2   <Class bk>
	//    5   12:getstatic       #27  <Field bk zzkl>
	//    6   15:invokestatic    #31  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
