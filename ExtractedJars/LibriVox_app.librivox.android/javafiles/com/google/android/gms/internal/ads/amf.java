// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, asm, 
//			asi, amg, amh, asj, 
//			alz, aug

public final class amf extends ash
	implements atx
{

	private amf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ash()>
		zzffl = aqq.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #34  <Field aqq aqq.a>
	//    4    8:putfield        #36  <Field aqq zzffl>
		zzffm = aqq.a;
	//    5   11:aload_0         
	//    6   12:getstatic       #34  <Field aqq aqq.a>
	//    7   15:putfield        #38  <Field aqq zzffm>
	//    8   18:return          
	}

	public static amf a(aqq aqq1)
	{
		return (amf)ash.a(((ash) (zzffn)), aqq1);
	//    0    0:getstatic       #24  <Field amf zzffn>
	//    1    3:aload_0         
	//    2    4:invokestatic    #42  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class amf>
	//    4   10:areturn         
	}

	private final void a(alz alz1)
	{
		if(alz1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzffd = alz1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field alz zzffd>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #47  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	static void a(amf amf1, int i)
	{
		amf1.b(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #53  <Method void b(int)>
	//    3    5:return          
	}

	static void a(amf amf1, alz alz1)
	{
		amf1.a(alz1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void a(alz)>
	//    3    5:return          
	}

	static void a(amf amf1, aqq aqq1)
	{
		amf1.b(aqq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void b(aqq)>
	//    3    5:return          
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field int zzfea>
	//    3    5:return          
	}

	static void b(amf amf1, aqq aqq1)
	{
		amf1.c(aqq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void c(aqq)>
	//    3    5:return          
	}

	private final void b(aqq aqq1)
	{
		if(aqq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzffl = aqq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field aqq zzffl>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #47  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void c(aqq aqq1)
	{
		if(aqq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzffm = aqq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field aqq zzffm>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #47  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #48  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	public static amg e()
	{
		return (amg)(asi)((ash) (zzffn)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #24  <Field amf zzffn>
	//    1    3:getstatic       #71  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #74  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #76  <Class asi>
	//    6   14:checkcast       #78  <Class amg>
	//    7   17:areturn         
	}

	public static amf f()
	{
		return zzffn;
	//    0    0:getstatic       #24  <Field amf zzffn>
	//    1    3:areturn         
	}

	static amf g()
	{
		return zzffn;
	//    0    0:getstatic       #24  <Field amf zzffn>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		amh.a[i - 1];
	//    0    0:getstatic       #87  <Field int[] amh.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 158
	//	               2 149
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #89  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #90  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #96  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #98  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/amf;
	//   19   71:ldc1            #2   <Class amf>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #98  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzffn)))));
	//   27   84:new             #100 <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #24  <Field amf zzffn>
	//   30   91:invokespecial   #103 <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #98  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/amf;
	//   34   99:ldc1            #2   <Class amf>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/amf;
	//   39  105:ldc1            #2   <Class amf>
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
		return ((Object) (zzffn));
	//   45  112:getstatic       #24  <Field amf zzffn>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzffn)), "\000\004\000\000\001\004\004\000\000\000\001\013\002\t\003\n\004\n", new Object[] {
			"zzfea", "zzffd", "zzffl", "zzffm"
		});
	//   47  116:getstatic       #24  <Field amf zzffn>
	//   48  119:ldc1            #105 <String "\000\004\000\000\001\004\004\000\000\000\001\013\002\t\003\n\004\n">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #108 <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #109 <String "zzffd">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #110 <String "zzffl">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #111 <String "zzffm">
	//   66  144:aastore         
	//   67  145:invokestatic    #114 <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new amg(((amh) (null)))));
	//   69  149:new             #78  <Class amg>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #117 <Method void amg(amh)>
	//   73  157:areturn         
_L2:
		return ((Object) (new amf()));
	//   74  158:new             #2   <Class amf>
	//   75  161:dup             
	//   76  162:invokespecial   #22  <Method void amf()>
	//   77  165:areturn         
	}

	public final alz b()
	{
		alz alz2 = zzffd;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field alz zzffd>
	//    2    4:astore_2        
		alz alz1 = alz2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(alz2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			alz1 = alz.d();
	//    7   11:invokestatic    #123 <Method alz alz.d()>
	//    8   14:astore_1        
		return alz1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final aqq c()
	{
		return zzffl;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field aqq zzffl>
	//    2    4:areturn         
	}

	public final aqq d()
	{
		return zzffm;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field aqq zzffm>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final amf zzffn;
	private int zzfea;
	private alz zzffd;
	private aqq zzffl;
	private aqq zzffm;

	static 
	{
		zzffn = new amf();
	//    0    0:new             #2   <Class amf>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void amf()>
	//    3    7:putstatic       #24  <Field amf zzffn>
		ash.a(com/google/android/gms/internal/ads/amf, ((ash) (zzffn)));
	//    4   10:ldc1            #2   <Class amf>
	//    5   12:getstatic       #24  <Field amf zzffn>
	//    6   15:invokestatic    #28  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
