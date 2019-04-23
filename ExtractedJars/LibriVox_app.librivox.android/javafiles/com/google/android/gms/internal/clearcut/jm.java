// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, by, bs, 
//			jn, jo, bt, ds

public final class jm extends br
	implements dj
{

	private jm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void br()>
		zzbis = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzbis>
	//    5   10:return          
	}

	private final void a(long l1)
	{
		zzbb = zzbb | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int zzbb>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #38  <Field int zzbb>
		zzbit = l1;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #40  <Field long zzbit>
	//    9   15:return          
	}

	static void a(jm jm1, long l1)
	{
		jm1.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #43  <Method void a(long)>
	//    3    5:return          
	}

	static void a(jm jm1, String s)
	{
		jm1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zzbb = zzbb | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field int zzbb>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #38  <Field int zzbb>
			zzbis = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #35  <Field String zzbis>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #49  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #50  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	private final void b(long l1)
	{
		zzbb = zzbb | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field int zzbb>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #38  <Field int zzbb>
		zzbiu = l1;
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:putfield        #53  <Field long zzbiu>
	//    9   16:return          
	}

	static void b(jm jm1, long l1)
	{
		jm1.b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #55  <Method void b(long)>
	//    3    5:return          
	}

	public static jn p()
	{
		return (jn)(bs)((br) (zzbiv)).a(by.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #25  <Field jm zzbiv>
	//    1    3:getstatic       #62  <Field int by.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #65  <Method Object br.a(int, Object, Object)>
	//    5   11:checkcast       #67  <Class bs>
	//    6   14:checkcast       #69  <Class jn>
	//    7   17:areturn         
	}

	static jm q()
	{
		return zzbiv;
	//    0    0:getstatic       #25  <Field jm zzbiv>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		jo.a[i - 1];
	//    0    0:getstatic       #76  <Field int[] jo.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 163
	//	               2 154
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 163
	//	               2 154
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
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #87  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/jm;
	//   19   71:ldc1            #2   <Class jm>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #87  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbiv)))));
	//   27   84:new             #89  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field jm zzbiv>
	//   30   91:invokespecial   #92  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #87  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/jm;
	//   34   99:ldc1            #2   <Class jm>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/jm;
	//   39  105:ldc1            #2   <Class jm>
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
		return ((Object) (zzbiv));
	//   45  112:getstatic       #25  <Field jm zzbiv>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzbiv)), "\001\004\000\001\001\004\004\005\000\000\000\001\004\000\002\b\001\003\002\002\004\002\003", new Object[] {
			"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"
		});
	//   47  116:getstatic       #25  <Field jm zzbiv>
	//   48  119:ldc1            #94  <String "\001\004\000\001\001\004\004\005\000\000\000\001\004\000\002\b\001\003\002\002\004\002\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #97  <String "zzbb">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #98  <String "zzya">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #99  <String "zzbis">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #100 <String "zzbit">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #101 <String "zzbiu">
	//   70  149:aastore         
	//   71  150:invokestatic    #104 <Method Object a(dh, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new jn(((jo) (null)))));
	//   73  154:new             #69  <Class jn>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #107 <Method void jn(jo)>
	//   77  162:areturn         
_L2:
		return ((Object) (new jm()));
	//   78  163:new             #2   <Class jm>
	//   79  166:dup             
	//   80  167:invokespecial   #23  <Method void jm()>
	//   81  170:areturn         
	}

	public final boolean a()
	{
		return (zzbb & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zzbb>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final int l()
	{
		return zzya;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int zzya>
	//    2    4:ireturn         
	}

	public final String m()
	{
		return zzbis;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzbis>
	//    2    4:areturn         
	}

	public final long n()
	{
		return zzbit;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field long zzbit>
	//    2    4:lreturn         
	}

	public final long o()
	{
		return zzbiu;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field long zzbiu>
	//    2    4:lreturn         
	}

	private static volatile ds zzbg;
	private static final jm zzbiv;
	private int zzbb;
	private String zzbis;
	private long zzbit;
	private long zzbiu;
	private int zzya;

	static 
	{
		zzbiv = new jm();
	//    0    0:new             #2   <Class jm>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void jm()>
	//    3    7:putstatic       #25  <Field jm zzbiv>
		br.a(com/google/android/gms/internal/clearcut/jm, ((br) (zzbiv)));
	//    4   10:ldc1            #2   <Class jm>
	//    5   12:getstatic       #25  <Field jm zzbiv>
	//    6   15:invokestatic    #29  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
