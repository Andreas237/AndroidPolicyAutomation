// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, anq, asj, 
//			anp, amy, and, aoi, 
//			aug

public final class ano extends ash
	implements atx
{

	private ano()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
	//    2    4:return          
	}

	static ano f()
	{
		return zzfho;
	//    0    0:getstatic       #23  <Field ano zzfho>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anq.a[i - 1];
	//    0    0:getstatic       #37  <Field int[] anq.a>
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
	//    6   48:new             #39  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #40  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #46  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #48  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/ano;
	//   19   71:ldc1            #2   <Class ano>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #48  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfho)))));
	//   27   84:new             #50  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field ano zzfho>
	//   30   91:invokespecial   #53  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #48  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/ano;
	//   34   99:ldc1            #2   <Class ano>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/ano;
	//   39  105:ldc1            #2   <Class ano>
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
		return ((Object) (zzfho));
	//   45  112:getstatic       #23  <Field ano zzfho>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfho)), "\000\004\000\000\001\004\004\000\000\000\001\t\002\f\003\013\004\f", new Object[] {
			"zzfhl", "zzfhm", "zzfhn", "zzfhb"
		});
	//   47  116:getstatic       #23  <Field ano zzfho>
	//   48  119:ldc1            #55  <String "\000\004\000\000\001\004\004\000\000\000\001\t\002\f\003\013\004\f">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #58  <String "zzfhl">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #59  <String "zzfhm">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #60  <String "zzfhn">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #61  <String "zzfhb">
	//   66  144:aastore         
	//   67  145:invokestatic    #64  <Method Object a(atv, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new anp(((anq) (null)))));
	//   69  149:new             #66  <Class anp>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #69  <Method void anp(anq)>
	//   73  157:areturn         
_L2:
		return ((Object) (new ano()));
	//   74  158:new             #2   <Class ano>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void ano()>
	//   77  165:areturn         
	}

	public final boolean a()
	{
		return zzfhl != null;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field amy zzfhl>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public final amy b()
	{
		amy amy2 = zzfhl;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field amy zzfhl>
	//    2    4:astore_2        
		amy amy1 = amy2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(amy2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			amy1 = amy.e();
	//    7   11:invokestatic    #79  <Method amy amy.e()>
	//    8   14:astore_1        
		return amy1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final and c()
	{
		and and2 = and.a(zzfhm);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field int zzfhm>
	//    2    4:invokestatic    #88  <Method and and.a(int)>
	//    3    7:astore_2        
		and and1 = and2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(and2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			and1 = and.c;
	//    8   14:getstatic       #91  <Field and and.c>
	//    9   17:astore_1        
		return and1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final int d()
	{
		return zzfhn;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int zzfhn>
	//    2    4:ireturn         
	}

	public final aoi e()
	{
		aoi aoi2 = aoi.a(zzfhb);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field int zzfhb>
	//    2    4:invokestatic    #103 <Method aoi aoi.a(int)>
	//    3    7:astore_2        
		aoi aoi1 = aoi2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(aoi2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			aoi1 = aoi.f;
	//    8   14:getstatic       #106 <Field aoi aoi.f>
	//    9   17:astore_1        
		return aoi1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static volatile aug zzcas;
	private static final ano zzfho;
	private int zzfhb;
	private amy zzfhl;
	private int zzfhm;
	private int zzfhn;

	static 
	{
		zzfho = new ano();
	//    0    0:new             #2   <Class ano>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void ano()>
	//    3    7:putstatic       #23  <Field ano zzfho>
		ash.a(com/google/android/gms/internal/ads/ano, ((ash) (zzfho)));
	//    4   10:ldc1            #2   <Class ano>
	//    5   12:getstatic       #23  <Field ano zzfho>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
