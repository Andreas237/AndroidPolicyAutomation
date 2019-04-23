// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.icing;


// Referenced classes of package com.google.android.gms.internal.icing:
//			bp, da, bt, bq, 
//			s, z, br, dj

public final class r extends bp
	implements da
{

	private r()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void bp()>
		zzbe = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzbe>
		zzbf = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #31  <String "">
	//    7   13:putfield        #35  <Field String zzbf>
	//    8   16:return          
	}

	public static s a()
	{
		return (s)(bq)((bp) (zzbh)).a(bt.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field r zzbh>
	//    1    3:getstatic       #41  <Field int bt.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #44  <Method Object bp.a(int, Object, Object)>
	//    5   11:checkcast       #46  <Class bq>
	//    6   14:checkcast       #48  <Class s>
	//    7   17:areturn         
	}

	static void a(r r1, int i)
	{
		r1.b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #53  <Method void b(int)>
	//    3    5:return          
	}

	static void a(r r1, String s1)
	{
		r1.a(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbd = zzbd | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int zzbd>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #59  <Field int zzbd>
			zzbe = s1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field String zzbe>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #61  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #62  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static r b()
	{
		return zzbh;
	//    0    0:getstatic       #23  <Field r zzbh>
	//    1    3:areturn         
	}

	private final void b(int i)
	{
		zzbd = zzbd | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field int zzbd>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #59  <Field int zzbd>
		zzbg = i;
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:putfield        #65  <Field int zzbg>
	//    9   15:return          
	}

	static void b(r r1, String s1)
	{
		r1.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void b(String)>
	//    3    5:return          
	}

	private final void b(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbd = zzbd | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int zzbd>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #59  <Field int zzbd>
			zzbf = s1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #35  <Field String zzbf>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #61  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #62  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		z.a[i - 1];
	//    0    0:getstatic       #72  <Field int[] z.a>
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
	//    6   48:new             #74  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #75  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #81  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbc));
	//   15   63:getstatic       #83  <Field dj zzbc>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/icing/r;
	//   19   71:ldc1            #2   <Class r>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbc));
	//   21   74:getstatic       #83  <Field dj zzbc>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new br(((bp) (zzbh)))));
	//   27   84:new             #85  <Class br>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field r zzbh>
	//   30   91:invokespecial   #88  <Method void br(bp)>
	//   31   94:astore_2        
		zzbc = ((dj) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #83  <Field dj zzbc>
_L12:
		com/google/android/gms/internal/icing/r;
	//   34   99:ldc1            #2   <Class r>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/icing/r;
	//   39  105:ldc1            #2   <Class r>
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
		return ((Object) (zzbh));
	//   45  112:getstatic       #23  <Field r zzbh>
	//   46  115:areturn         
_L4:
		return a(((cy) (zzbh)), "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\b\001\003\004\002", new Object[] {
			"zzbd", "zzbe", "zzbf", "zzbg"
		});
	//   47  116:getstatic       #23  <Field r zzbh>
	//   48  119:ldc1            #90  <String "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\b\001\003\004\002">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #93  <String "zzbd">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #94  <String "zzbe">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #95  <String "zzbf">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #96  <String "zzbg">
	//   66  144:aastore         
	//   67  145:invokestatic    #99  <Method Object a(cy, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new s(((z) (null)))));
	//   69  149:new             #48  <Class s>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #102 <Method void s(z)>
	//   73  157:areturn         
_L2:
		return ((Object) (new r()));
	//   74  158:new             #2   <Class r>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void r()>
	//   77  165:areturn         
	}

	private static volatile dj zzbc;
	private static final r zzbh;
	private int zzbd;
	private String zzbe;
	private String zzbf;
	private int zzbg;

	static 
	{
		zzbh = new r();
	//    0    0:new             #2   <Class r>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void r()>
	//    3    7:putstatic       #23  <Field r zzbh>
		bp.a(com/google/android/gms/internal/icing/r, ((bp) (zzbh)));
	//    4   10:ldc1            #2   <Class r>
	//    5   12:getstatic       #23  <Field r zzbh>
	//    6   15:invokestatic    #27  <Method void bp.a(Class, bp)>
	//*   7   18:return          
	}
}
