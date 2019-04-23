// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, ami, amb, 
//			asj, ama, als, alq, 
//			aug

public final class alz extends ash
	implements atx
{

	private alz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ash()>
	//    2    4:return          
	}

	public static alz d()
	{
		return zzffi;
	//    0    0:getstatic       #23  <Field alz zzffi>
	//    1    3:areturn         
	}

	static alz e()
	{
		return zzffi;
	//    0    0:getstatic       #23  <Field alz zzffi>
	//    1    3:areturn         
	}

	public final ami a()
	{
		ami ami2 = zzfff;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ami zzfff>
	//    2    4:astore_2        
		ami ami1 = ami2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(ami2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			ami1 = ami.d();
	//    7   11:invokestatic    #39  <Method ami ami.d()>
	//    8   14:astore_1        
		return ami1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		amb.a[i - 1];
	//    0    0:getstatic       #45  <Field int[] amb.a>
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
	//    6   48:new             #47  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #48  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #54  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #56  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/alz;
	//   19   71:ldc1            #2   <Class alz>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #56  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzffi)))));
	//   27   84:new             #58  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field alz zzffi>
	//   30   91:invokespecial   #61  <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #56  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/alz;
	//   34   99:ldc1            #2   <Class alz>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/alz;
	//   39  105:ldc1            #2   <Class alz>
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
		return ((Object) (zzffi));
	//   45  112:getstatic       #23  <Field alz zzffi>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzffi)), "\000\003\000\000\001\003\003\000\000\000\001\t\002\t\003\f", new Object[] {
			"zzfff", "zzffg", "zzffh"
		});
	//   47  116:getstatic       #23  <Field alz zzffi>
	//   48  119:ldc1            #63  <String "\000\003\000\000\001\003\003\000\000\000\001\t\002\t\003\f">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #66  <String "zzfff">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #67  <String "zzffg">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #68  <String "zzffh">
	//   62  139:aastore         
	//   63  140:invokestatic    #71  <Method Object a(atv, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new ama(((amb) (null)))));
	//   65  144:new             #73  <Class ama>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #76  <Method void ama(amb)>
	//   69  152:areturn         
_L2:
		return ((Object) (new alz()));
	//   70  153:new             #2   <Class alz>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void alz()>
	//   73  160:areturn         
	}

	public final als b()
	{
		als als2 = zzffg;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field als zzffg>
	//    2    4:astore_2        
		als als1 = als2;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(als2 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			als1 = als.b();
	//    7   11:invokestatic    #84  <Method als als.b()>
	//    8   14:astore_1        
		return als1;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public final alq c()
	{
		alq alq2 = alq.a(zzffh);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int zzffh>
	//    2    4:invokestatic    #93  <Method alq alq.a(int)>
	//    3    7:astore_2        
		alq alq1 = alq2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(alq2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			alq1 = alq.e;
	//    8   14:getstatic       #96  <Field alq alq.e>
	//    9   17:astore_1        
		return alq1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private static volatile aug zzcas;
	private static final alz zzffi;
	private ami zzfff;
	private als zzffg;
	private int zzffh;

	static 
	{
		zzffi = new alz();
	//    0    0:new             #2   <Class alz>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void alz()>
	//    3    7:putstatic       #23  <Field alz zzffi>
		ash.a(com/google/android/gms/internal/ads/alz, ((ash) (zzffi)));
	//    4   10:ldc1            #2   <Class alz>
	//    5   12:getstatic       #23  <Field alz zzffi>
	//    6   15:invokestatic    #27  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
