// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;


// Referenced classes of package com.google.android.gms.internal.icing:
//			bp, da, bt, bq, 
//			u, z, br, dj, 
//			x

public final class t extends bp
	implements da
{

	private t()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void bp()>
		zzbi = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzbi>
	//    5   10:return          
	}

	public static u a()
	{
		return (u)(bq)((bp) (zzbk)).a(bt.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field t zzbk>
	//    1    3:getstatic       #39  <Field int bt.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #42  <Method Object bp.a(int, Object, Object)>
	//    5   11:checkcast       #44  <Class bq>
	//    6   14:checkcast       #46  <Class u>
	//    7   17:areturn         
	}

	static void a(t t1, x x)
	{
		t1.a(x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void a(x)>
	//    3    5:return          
	}

	static void a(t t1, String s)
	{
		t1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(x x)
	{
		if(x != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbj = x;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #56  <Field x zzbj>
			zzbd = zzbd | 2;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #58  <Field int zzbd>
	//    8   14:iconst_2        
	//    9   15:ior             
	//   10   16:putfield        #58  <Field int zzbd>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #60  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #61  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbd = zzbd | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field int zzbd>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #58  <Field int zzbd>
			zzbi = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field String zzbi>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #60  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #61  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static t b()
	{
		return zzbk;
	//    0    0:getstatic       #23  <Field t zzbk>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		z.a[i - 1];
	//    0    0:getstatic       #68  <Field int[] z.a>
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
	//    6   48:new             #70  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #71  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #77  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbc));
	//   15   63:getstatic       #79  <Field dj zzbc>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/icing/t;
	//   19   71:ldc1            #2   <Class t>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbc));
	//   21   74:getstatic       #79  <Field dj zzbc>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new br(((bp) (zzbk)))));
	//   27   84:new             #81  <Class br>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field t zzbk>
	//   30   91:invokespecial   #84  <Method void br(bp)>
	//   31   94:astore_2        
		zzbc = ((dj) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #79  <Field dj zzbc>
_L12:
		com/google/android/gms/internal/icing/t;
	//   34   99:ldc1            #2   <Class t>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/icing/t;
	//   39  105:ldc1            #2   <Class t>
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
		return ((Object) (zzbk));
	//   45  112:getstatic       #23  <Field t zzbk>
	//   46  115:areturn         
_L4:
		return a(((cy) (zzbk)), "\001\002\000\001\001\002\002\000\000\000\001\b\000\002\t\001", new Object[] {
			"zzbd", "zzbi", "zzbj"
		});
	//   47  116:getstatic       #23  <Field t zzbk>
	//   48  119:ldc1            #86  <String "\001\002\000\001\001\002\002\000\000\000\001\b\000\002\t\001">
	//   49  121:iconst_3        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #89  <String "zzbd">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #90  <String "zzbi">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #91  <String "zzbj">
	//   62  139:aastore         
	//   63  140:invokestatic    #94  <Method Object a(cy, String, Object[])>
	//   64  143:areturn         
_L3:
		return ((Object) (new u(((z) (null)))));
	//   65  144:new             #46  <Class u>
	//   66  147:dup             
	//   67  148:aconst_null     
	//   68  149:invokespecial   #97  <Method void u(z)>
	//   69  152:areturn         
_L2:
		return ((Object) (new t()));
	//   70  153:new             #2   <Class t>
	//   71  156:dup             
	//   72  157:invokespecial   #21  <Method void t()>
	//   73  160:areturn         
	}

	private static volatile dj zzbc;
	private static final t zzbk;
	private int zzbd;
	private String zzbi;
	private x zzbj;

	static 
	{
		zzbk = new t();
	//    0    0:new             #2   <Class t>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void t()>
	//    3    7:putstatic       #23  <Field t zzbk>
		bp.a(com/google/android/gms/internal/icing/t, ((bp) (zzbk)));
	//    4   10:ldc1            #2   <Class t>
	//    5   12:getstatic       #23  <Field t zzbk>
	//    6   15:invokestatic    #27  <Method void bp.a(Class, bp)>
	//*   7   18:return          
	}
}
