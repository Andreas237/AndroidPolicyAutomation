// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, ana, 
//			asm, asi, amz, anb, 
//			asj, aug

public final class amy extends ash
	implements atx
{

	private amy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfgk = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzfgk>
		zzfgl = aqq.a;
	//    5   10:aload_0         
	//    6   11:getstatic       #37  <Field aqq aqq.a>
	//    7   14:putfield        #39  <Field aqq zzfgl>
	//    8   17:return          
	}

	static void a(amy amy1, ana ana1)
	{
		amy1.a(ana1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void a(ana)>
	//    3    5:return          
	}

	static void a(amy amy1, aqq aqq1)
	{
		amy1.a(aqq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void a(aqq)>
	//    3    5:return          
	}

	static void a(amy amy1, String s)
	{
		amy1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(ana ana1)
	{
		if(ana1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
		{
			zzfgm = ana1.a();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #56  <Method int ana.a()>
	//    5    9:putfield        #58  <Field int zzfgm>
			return;
	//    6   12:return          
		} else
		{
			throw new NullPointerException();
	//    7   13:new             #60  <Class NullPointerException>
	//    8   16:dup             
	//    9   17:invokespecial   #61  <Method void NullPointerException()>
	//   10   20:athrow          
		}
	}

	private final void a(aqq aqq1)
	{
		if(aqq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfgl = aqq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field aqq zzfgl>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #60  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #61  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfgk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String zzfgk>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #60  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #61  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	public static amz d()
	{
		return (amz)(asi)((ash) (zzfgn)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field amy zzfgn>
	//    1    3:getstatic       #68  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #71  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #73  <Class asi>
	//    6   14:checkcast       #75  <Class amz>
	//    7   17:areturn         
	}

	public static amy e()
	{
		return zzfgn;
	//    0    0:getstatic       #23  <Field amy zzfgn>
	//    1    3:areturn         
	}

	static amy f()
	{
		return zzfgn;
	//    0    0:getstatic       #23  <Field amy zzfgn>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anb.a[i - 1];
	//    0    0:getstatic       #82  <Field int[] anb.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 153
	//	               2 144
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #84  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #85  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #91  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #93  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/amy;
	//   19   71:ldc1            #2   <Class amy>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #93  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfgn)))));
	//   27   84:new             #95  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field amy zzfgn>
	//   30   91:invokespecial   #98  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #93  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/amy;
	//   34   99:ldc1            #2   <Class amy>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/amy;
	//   39  105:ldc1            #2   <Class amy>
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
		return ((Object) (zzfgn));
	//   45  112:getstatic       #23  <Field amy zzfgn>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfgn)), "\000\003\000\000\001\003\003\000\000\000\001\u0208\002\n\003\f", new Object[] {
			"zzfgk", "zzfgl", "zzfgm"
		});
	//   47  116:getstatic       #23  <Field amy zzfgn>
	//   48  119:ldc1            #100 <String "\000\003\000\000\001\003\003\000\000\000\001\u0208\002\n\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #103 <String "zzfgk">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #104 <String "zzfgl">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #105 <String "zzfgm">
	//   62  139:aastore         
	//   63  140:invokestatic    #108 <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new amz(((anb) (null)))));
	//   65  144:new             #75  <Class amz>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #111 <Method void amz(anb)>
	//   69  152:areturn         
_L2:
		return ((Object) (new amy()));
	//   70  153:new             #2   <Class amy>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void amy()>
	//   73  160:areturn         
	}

	public final String a()
	{
		return zzfgk;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String zzfgk>
	//    2    4:areturn         
	}

	public final aqq b()
	{
		return zzfgl;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field aqq zzfgl>
	//    2    4:areturn         
	}

	public final ana c()
	{
		ana ana2 = ana.a(zzfgm);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int zzfgm>
	//    2    4:invokestatic    #119 <Method ana ana.a(int)>
	//    3    7:astore_2        
		ana ana1 = ana2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(ana2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			ana1 = ana.f;
	//    8   14:getstatic       #122 <Field ana ana.f>
	//    9   17:astore_1        
		return ana1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static volatile aug zzcas;
	private static final amy zzfgn;
	private String zzfgk;
	private aqq zzfgl;
	private int zzfgm;

	static 
	{
		zzfgn = new amy();
	//    0    0:new             #2   <Class amy>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void amy()>
	//    3    7:putstatic       #23  <Field amy zzfgn>
		ash.a(com/google/android/gms/internal/ads/amy, ((ash) (zzfgn)));
	//    4   10:ldc1            #2   <Class amy>
	//    5   12:getstatic       #23  <Field amy zzfgn>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
