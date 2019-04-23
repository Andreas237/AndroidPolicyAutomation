// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ash, atx, asm, asi, 
//			ank, anl, asj, aug

public final class anj extends ash
	implements atx
{

	private anj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ash()>
		zzfhd = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzfhd>
		zzfgk = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #33  <String "">
	//    7   13:putfield        #37  <Field String zzfgk>
		zzfhg = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #33  <String "">
	//   10   19:putfield        #39  <Field String zzfhg>
	//   11   22:return          
	}

	static void a(anj anj1, int i)
	{
		anj1.b(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #44  <Method void b(int)>
	//    3    5:return          
	}

	static void a(anj anj1, String s)
	{
		anj1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void a(String)>
	//    3    5:return          
	}

	static void a(anj anj1, boolean flag)
	{
		anj1.a(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #52  <Method void a(boolean)>
	//    3    5:return          
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfhd = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String zzfhd>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #54  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #55  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	private final void a(boolean flag)
	{
		zzfhf = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean zzfhf>
	//    3    5:return          
	}

	private final void b(int i)
	{
		zzfhe = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int zzfhe>
	//    3    5:return          
	}

	static void b(anj anj1, String s)
	{
		anj1.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void b(String)>
	//    3    5:return          
	}

	private final void b(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfgk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String zzfgk>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #54  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #55  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	static void c(anj anj1, String s)
	{
		anj1.c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #64  <Method void c(String)>
	//    3    5:return          
	}

	private final void c(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			zzfhg = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String zzfhg>
			return;
	//    5    9:return          
		} else
		{
			throw new NullPointerException();
	//    6   10:new             #54  <Class NullPointerException>
	//    7   13:dup             
	//    8   14:invokespecial   #55  <Method void NullPointerException()>
	//    9   17:athrow          
		}
	}

	public static ank f()
	{
		return (ank)(asi)((ash) (zzfhh)).a(asm.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #25  <Field anj zzfhh>
	//    1    3:getstatic       #71  <Field int asm.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #74  <Method Object ash.a(int, Object, Object)>
	//    5   11:checkcast       #76  <Class asi>
	//    6   14:checkcast       #78  <Class ank>
	//    7   17:areturn         
	}

	static anj g()
	{
		return zzfhh;
	//    0    0:getstatic       #25  <Field anj zzfhh>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		anl.a[i - 1];
	//    0    0:getstatic       #85  <Field int[] anl.a>
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
	//    6   48:new             #87  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #88  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #94  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzcas));
	//   15   63:getstatic       #96  <Field aug zzcas>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/ads/anj;
	//   19   71:ldc1            #2   <Class anj>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzcas));
	//   21   74:getstatic       #96  <Field aug zzcas>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new asj(((ash) (zzfhh)))));
	//   27   84:new             #98  <Class asj>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field anj zzfhh>
	//   30   91:invokespecial   #101 <Method void asj(ash)>
	//   31   94:astore_2        
		zzcas = ((aug) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #96  <Field aug zzcas>
_L12:
		com/google/android/gms/internal/ads/anj;
	//   34   99:ldc1            #2   <Class anj>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/ads/anj;
	//   39  105:ldc1            #2   <Class anj>
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
		return ((Object) (zzfhh));
	//   45  112:getstatic       #25  <Field anj zzfhh>
	//   46  115:areturn         
_L4:
		return a(((atv) (zzfhh)), "\000\005\000\000\001\005\005\000\000\000\001\u0208\002\u0208\003\013\004\007\005\u0208", new Object[] {
			"zzfhd", "zzfgk", "zzfhe", "zzfhf", "zzfhg"
		});
	//   47  116:getstatic       #25  <Field anj zzfhh>
	//   48  119:ldc1            #103 <String "\000\005\000\000\001\005\005\000\000\000\001\u0208\002\u0208\003\013\004\007\005\u0208">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #106 <String "zzfhd">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #107 <String "zzfgk">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #108 <String "zzfhe">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #109 <String "zzfhf">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #110 <String "zzfhg">
	//   70  149:aastore         
	//   71  150:invokestatic    #113 <Method Object a(atv, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new ank(((anl) (null)))));
	//   73  154:new             #78  <Class ank>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #116 <Method void ank(anl)>
	//   77  162:areturn         
_L2:
		return ((Object) (new anj()));
	//   78  163:new             #2   <Class anj>
	//   79  166:dup             
	//   80  167:invokespecial   #23  <Method void anj()>
	//   81  170:areturn         
	}

	public final String a()
	{
		return zzfhd;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String zzfhd>
	//    2    4:areturn         
	}

	public final String b()
	{
		return zzfgk;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzfgk>
	//    2    4:areturn         
	}

	public final int c()
	{
		return zzfhe;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int zzfhe>
	//    2    4:ireturn         
	}

	public final boolean d()
	{
		return zzfhf;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean zzfhf>
	//    2    4:ireturn         
	}

	public final String e()
	{
		return zzfhg;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String zzfhg>
	//    2    4:areturn         
	}

	private static volatile aug zzcas;
	private static final anj zzfhh;
	private String zzfgk;
	private String zzfhd;
	private int zzfhe;
	private boolean zzfhf;
	private String zzfhg;

	static 
	{
		zzfhh = new anj();
	//    0    0:new             #2   <Class anj>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void anj()>
	//    3    7:putstatic       #25  <Field anj zzfhh>
		ash.a(com/google/android/gms/internal/ads/anj, ((ash) (zzfhh)));
	//    4   10:ldc1            #2   <Class anj>
	//    5   12:getstatic       #25  <Field anj zzfhh>
	//    6   15:invokestatic    #29  <Method void ash.a(Class, ash)>
	//*   7   18:return          
	}
}
