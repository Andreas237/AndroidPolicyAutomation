// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			akk, akl, asj, akp, 
//			amp, aug, aqq

public final class akj extends ash
	implements atx
{

	private akj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
	//    2    4:return          
	}

	public static akj a(aqq aqq)
	{
		return (akj)ash.a(((ash) (zzfed)), aqq);
	//    0    0:getstatic       #23  <Field akj zzfed>
	//    1    3:aload_0         
	//    2    4:invokestatic    #33  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class akj>
	//    4   10:areturn         
	}

	static void a(akj akj1, int i)
	{
		akj1.b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #38  <Method void b(int)>
	//    3    5:return          
	}

	static void a(akj akj1, akp akp1)
	{
		akj1.a(akp1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void a(akp)>
	//    3    5:return          
	}

	static void a(akj akj1, amp amp1)
	{
		akj1.a(amp1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void a(amp)>
	//    3    5:return          
	}

	private final void a(akp akp1)
	{
		if(akp1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfeb = akp1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #48  <Field akp zzfeb>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #50  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #51  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void a(amp amp1)
	{
		if(amp1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfec = amp1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field amp zzfec>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #50  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #51  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int zzfea>
	//    3    5:return          
	}

	public static akk d()
	{
		return (akk)(asi)((ash) (zzfed)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field akj zzfed>
	//    1    3:getstatic       #62  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #65  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #67  <Class asi>
	//    6   14:checkcast       #69  <Class akk>
	//    7   17:areturn         
	}

	static akj e()
	{
		return zzfed;
	//    0    0:getstatic       #23  <Field akj zzfed>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		akl.a[i - 1];
	//    0    0:getstatic       #76  <Field int[] akl.a>
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
	//    6   48:new             #78  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #79  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #85  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #87  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/akj;
	//   19   71:ldc1            #2   <Class akj>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #87  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfed)))));
	//   27   84:new             #89  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field akj zzfed>
	//   30   91:invokespecial   #92  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #87  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/akj;
	//   34   99:ldc1            #2   <Class akj>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/akj;
	//   39  105:ldc1            #2   <Class akj>
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
		return ((Object) (zzfed));
	//   45  112:getstatic       #23  <Field akj zzfed>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfed)), "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\t", new Object[] {
			"zzfea", "zzfeb", "zzfec"
		});
	//   47  116:getstatic       #23  <Field akj zzfed>
	//   48  119:ldc1            #94  <String "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\t">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #97  <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #98  <String "zzfeb">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #99  <String "zzfec">
	//   62  139:aastore         
	//   63  140:invokestatic    #102 <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new akk(((akl) (null)))));
	//   65  144:new             #69  <Class akk>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #105 <Method void akk(akl)>
	//   69  152:areturn         
_L2:
		return ((Object) (new akj()));
	//   70  153:new             #2   <Class akj>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void akj()>
	//   73  160:areturn         
	}

	public final akp b()
	{
		akp akp2 = zzfeb;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field akp zzfeb>
	//    2    4:astore_2        
		akp akp1 = akp2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(akp2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			akp1 = akp.e();
	//    7   11:invokestatic    #110 <Method akp akp.e()>
	//    8   14:astore_1        
		return akp1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final amp c()
	{
		amp amp2 = zzfec;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field amp zzfec>
	//    2    4:astore_2        
		amp amp1 = amp2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(amp2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			amp1 = amp.e();
	//    7   11:invokestatic    #116 <Method amp amp.e()>
	//    8   14:astore_1        
		return amp1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	private static volatile aug zzcas;
	private static final akj zzfed;
	private int zzfea;
	private akp zzfeb;
	private amp zzfec;

	static 
	{
		zzfed = new akj();
	//    0    0:new             #2   <Class akj>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void akj()>
	//    3    7:putstatic       #23  <Field akj zzfed>
		ash.a(com/google/android/gms/internal/ads/akj, ((ash) (zzfed)));
	//    4   10:ldc1            #2   <Class akj>
	//    5   12:getstatic       #23  <Field akj zzfed>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
