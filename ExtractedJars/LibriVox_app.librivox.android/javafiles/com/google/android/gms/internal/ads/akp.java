// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, asm, 
//			asi, akq, akr, asj, 
//			akv, aug

public final class akp extends ash
	implements atx
{

	private akp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
		zzfei = aqq.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #33  <Field aqq aqq.a>
	//    4    8:putfield        #35  <Field aqq zzfei>
	//    5   11:return          
	}

	public static akp a(aqq aqq1)
	{
		return (akp)ash.a(((ash) (zzfej)), aqq1);
	//    0    0:getstatic       #23  <Field akp zzfej>
	//    1    3:aload_0         
	//    2    4:invokestatic    #39  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class akp>
	//    4   10:areturn         
	}

	static void a(akp akp1, int i)
	{
		akp1.b(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #44  <Method void b(int)>
	//    3    5:return          
	}

	static void a(akp akp1, akv akv1)
	{
		akp1.a(akv1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void a(akv)>
	//    3    5:return          
	}

	static void a(akp akp1, aqq aqq1)
	{
		akp1.b(aqq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void b(aqq)>
	//    3    5:return          
	}

	private final void a(akv akv1)
	{
		if(akv1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfeh = akv1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field akv zzfeh>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #56  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #57  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int zzfea>
	//    3    5:return          
	}

	private final void b(aqq aqq1)
	{
		if(aqq1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfei = aqq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field aqq zzfei>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #56  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #57  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	public static akq d()
	{
		return (akq)(asi)((ash) (zzfej)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field akp zzfej>
	//    1    3:getstatic       #66  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #69  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #71  <Class asi>
	//    6   14:checkcast       #73  <Class akq>
	//    7   17:areturn         
	}

	public static akp e()
	{
		return zzfej;
	//    0    0:getstatic       #23  <Field akp zzfej>
	//    1    3:areturn         
	}

	static akp f()
	{
		return zzfej;
	//    0    0:getstatic       #23  <Field akp zzfej>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		akr.a[i - 1];
	//    0    0:getstatic       #81  <Field int[] akr.a>
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
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #92  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/akp;
	//   19   71:ldc1            #2   <Class akp>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #92  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfej)))));
	//   27   84:new             #94  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field akp zzfej>
	//   30   91:invokespecial   #97  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #92  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/akp;
	//   34   99:ldc1            #2   <Class akp>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/akp;
	//   39  105:ldc1            #2   <Class akp>
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
		return ((Object) (zzfej));
	//   45  112:getstatic       #23  <Field akp zzfej>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfej)), "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] {
			"zzfea", "zzfeh", "zzfei"
		});
	//   47  116:getstatic       #23  <Field akp zzfej>
	//   48  119:ldc1            #99  <String "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #102 <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #103 <String "zzfeh">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #104 <String "zzfei">
	//   62  139:aastore         
	//   63  140:invokestatic    #107 <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new akq(((akr) (null)))));
	//   65  144:new             #73  <Class akq>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #110 <Method void akq(akr)>
	//   69  152:areturn         
_L2:
		return ((Object) (new akp()));
	//   70  153:new             #2   <Class akp>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void akp()>
	//   73  160:areturn         
	}

	public final akv b()
	{
		akv akv2 = zzfeh;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field akv zzfeh>
	//    2    4:astore_2        
		akv akv1 = akv2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(akv2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			akv1 = akv.b();
	//    7   11:invokestatic    #115 <Method akv akv.b()>
	//    8   14:astore_1        
		return akv1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final aqq c()
	{
		return zzfei;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field aqq zzfei>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final akp zzfej;
	private int zzfea;
	private akv zzfeh;
	private aqq zzfei;

	static 
	{
		zzfej = new akp();
	//    0    0:new             #2   <Class akp>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void akp()>
	//    3    7:putstatic       #23  <Field akp zzfej>
		ash.a(com/google/android/gms/internal/ads/akp, ((ash) (zzfej)));
	//    4   10:ldc1            #2   <Class akp>
	//    5   12:getstatic       #23  <Field akp zzfej>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
