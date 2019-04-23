// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;


// Referenced classes of package com.google.android.gms.internal.icing:
//			bp, da, bt, bq, 
//			q, bx, ab, z, 
//			br, r, dj

public final class p extends bp
	implements da
{

	private p()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void bp()>
		zzba = h();
	//    2    4:aload_0         
	//    3    5:invokestatic    #29  <Method bx h()>
	//    4    8:putfield        #31  <Field bx zzba>
	//    5   11:return          
	}

	public static q a()
	{
		return (q)(bq)((bp) (zzbb)).a(bt.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #19  <Field p zzbb>
	//    1    3:getstatic       #38  <Field int bt.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #41  <Method Object bp.a(int, Object, Object)>
	//    5   11:checkcast       #43  <Class bq>
	//    6   14:checkcast       #45  <Class q>
	//    7   17:areturn         
	}

	static void a(p p1, Iterable iterable)
	{
		p1.a(iterable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void a(Iterable)>
	//    3    5:return          
	}

	private final void a(Iterable iterable)
	{
		if(!zzba.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field bx zzba>
	//*   2    4:invokeinterface #54  <Method boolean bx.a()>
	//*   3    9:ifne            49
		{
			bx bx1 = zzba;
	//    4   12:aload_0         
	//    5   13:getfield        #31  <Field bx zzba>
	//    6   16:astore_3        
			int i = bx1.size();
	//    7   17:aload_3         
	//    8   18:invokeinterface #58  <Method int bx.size()>
	//    9   23:istore_2        
			if(i == 0)
	//*  10   24:iload_2         
	//*  11   25:ifne            34
				i = 10;
	//   12   28:bipush          10
	//   13   30:istore_2        
			else
	//*  14   31:goto            38
				i <<= 1;
	//   15   34:iload_2         
	//   16   35:iconst_1        
	//   17   36:ishl            
	//   18   37:istore_2        
			zzba = bx1.b(i);
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:iload_2         
	//   22   41:invokeinterface #62  <Method bx bx.b(int)>
	//   23   46:putfield        #31  <Field bx zzba>
		}
		ab.a(iterable, ((java.util.List) (zzba)));
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:getfield        #31  <Field bx zzba>
	//   27   54:invokestatic    #67  <Method void ab.a(Iterable, java.util.List)>
	//   28   57:return          
	}

	static p b()
	{
		return zzbb;
	//    0    0:getstatic       #19  <Field p zzbb>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		z.a[i - 1];
	//    0    0:getstatic       #73  <Field int[] z.a>
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
		obj = ((Object) (zzbc));
	//   15   63:getstatic       #84  <Field dj zzbc>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/icing/p;
	//   19   71:ldc1            #2   <Class p>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbc));
	//   21   74:getstatic       #84  <Field dj zzbc>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new br(((bp) (zzbb)))));
	//   27   84:new             #86  <Class br>
	//   28   87:dup             
	//   29   88:getstatic       #19  <Field p zzbb>
	//   30   91:invokespecial   #89  <Method void br(bp)>
	//   31   94:astore_2        
		zzbc = ((dj) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #84  <Field dj zzbc>
_L12:
		com/google/android/gms/internal/icing/p;
	//   34   99:ldc1            #2   <Class p>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/icing/p;
	//   39  105:ldc1            #2   <Class p>
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
		return ((Object) (zzbb));
	//   45  112:getstatic       #19  <Field p zzbb>
	//   46  115:areturn         
_L4:
		return a(((cy) (zzbb)), "\001\001\000\000\001\001\001\000\001\000\001\033", new Object[] {
			"zzba", com/google/android/gms/internal/icing/r
		});
	//   47  116:getstatic       #19  <Field p zzbb>
	//   48  119:ldc1            #91  <String "\001\001\000\000\001\001\001\000\001\000\001\033">
	//   49  121:iconst_2        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #94  <String "zzba">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #96  <Class r>
	//   58  134:aastore         
	//   59  135:invokestatic    #99  <Method Object a(cy, String, Object[])>
	//   60  138:areturn         
_L3:
		return ((Object) (new q(((z) (null)))));
	//   61  139:new             #45  <Class q>
	//   62  142:dup             
	//   63  143:aconst_null     
	//   64  144:invokespecial   #102 <Method void q(z)>
	//   65  147:areturn         
_L2:
		return ((Object) (new p()));
	//   66  148:new             #2   <Class p>
	//   67  151:dup             
	//   68  152:invokespecial   #17  <Method void p()>
	//   69  155:areturn         
	}

	private static final p zzbb;
	private static volatile dj zzbc;
	private bx zzba;

	static 
	{
		zzbb = new p();
	//    0    0:new             #2   <Class p>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void p()>
	//    3    7:putstatic       #19  <Field p zzbb>
		bp.a(com/google/android/gms/internal/icing/p, ((bp) (zzbb)));
	//    4   10:ldc1            #2   <Class p>
	//    5   12:getstatic       #19  <Field p zzbb>
	//    6   15:invokestatic    #23  <Method void bp.a(Class, bp)>
	//*   7   18:return          
	}
}
