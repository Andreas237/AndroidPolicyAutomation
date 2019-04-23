// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, aqq, asm, 
//			asi, alo, alp, asj, 
//			aug

public final class aln extends ash
	implements atx
{

	private aln()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void ash()>
		zzfei = aqq.a;
	//    2    4:aload_0         
	//    3    5:getstatic       #31  <Field aqq aqq.a>
	//    4    8:putfield        #33  <Field aqq zzfei>
	//    5   11:return          
	}

	public static aln a(aqq aqq1)
	{
		return (aln)ash.a(((ash) (zzfeu)), aqq1);
	//    0    0:getstatic       #21  <Field aln zzfeu>
	//    1    3:aload_0         
	//    2    4:invokestatic    #37  <Method ash ash.a(ash, aqq)>
	//    3    7:checkcast       #2   <Class aln>
	//    4   10:areturn         
	}

	static void a(aln aln1, int i)
	{
		aln1.b(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #42  <Method void b(int)>
	//    3    5:return          
	}

	static void a(aln aln1, aqq aqq1)
	{
		aln1.b(aqq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void b(aqq)>
	//    3    5:return          
	}

	private final void b(int i)
	{
		zzfea = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int zzfea>
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
	//    4    6:putfield        #33  <Field aqq zzfei>
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

	public static alo c()
	{
		return (alo)(asi)((ash) (zzfeu)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #21  <Field aln zzfeu>
	//    1    3:getstatic       #58  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #61  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #63  <Class asi>
	//    6   14:checkcast       #65  <Class alo>
	//    7   17:areturn         
	}

	static aln d()
	{
		return zzfeu;
	//    0    0:getstatic       #21  <Field aln zzfeu>
	//    1    3:areturn         
	}

	public final int a()
	{
		return zzfea;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzfea>
	//    2    4:ireturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		alp.a[i - 1];
	//    0    0:getstatic       #73  <Field int[] alp.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 148
	//	               2 139
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #75  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #76  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #82  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #84  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/aln;
	//   19   71:ldc1            #2   <Class aln>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #84  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfeu)))));
	//   27   84:new             #86  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #21  <Field aln zzfeu>
	//   30   91:invokespecial   #89  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #84  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/aln;
	//   34   99:ldc1            #2   <Class aln>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/aln;
	//   39  105:ldc1            #2   <Class aln>
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
		return ((Object) (zzfeu));
	//   45  112:getstatic       #21  <Field aln zzfeu>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfeu)), "\000\002\000\000\001\002\002\000\000\000\001\013\002\n", new Object[] {
			"zzfea", "zzfei"
		});
	//   47  116:getstatic       #21  <Field aln zzfeu>
	//   48  119:ldc1            #91  <String "\000\002\000\000\001\002\002\000\000\000\001\013\002\n">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #94  <String "zzfea">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #95  <String "zzfei">
	//   58  134:aastore         
	//   59  135:invokestatic    #98  <Method Object a(atv, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new alo(((alp) (null)))));
	//   61  139:new             #65  <Class alo>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #101 <Method void alo(alp)>
	//   65  147:areturn         
_L2:
		return ((Object) (new aln()));
	//   66  148:new             #2   <Class aln>
	//   67  151:dup             
	//   68  152:invokespecial   #19  <Method void aln()>
	//   69  155:areturn         
	}

	public final aqq b()
	{
		return zzfei;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field aqq zzfei>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final aln zzfeu;
	private int zzfea;
	private aqq zzfei;

	static 
	{
		zzfeu = new aln();
	//    0    0:new             #2   <Class aln>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void aln()>
	//    3    7:putstatic       #21  <Field aln zzfeu>
		ash.a(com/google/android/gms/internal/ads/aln, ((ash) (zzfeu)));
	//    4   10:ldc1            #2   <Class aln>
	//    5   12:getstatic       #21  <Field aln zzfeu>
	//    6   15:invokestatic    #25  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
