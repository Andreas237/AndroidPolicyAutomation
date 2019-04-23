// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, et, eq, 
//			ao, ap, er, go

public final class an extends ep
	implements gg
{

	private an()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void ep()>
		zzir = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #31  <String "">
	//    4    7:putfield        #33  <Field String zzir>
		zzis = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #31  <String "">
	//    7   13:putfield        #35  <Field String zzis>
		zzit = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #31  <String "">
	//   10   19:putfield        #37  <Field String zzit>
	//   11   22:return          
	}

	static void a(an an1, String s)
	{
		an1.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #43  <Field int zziq>
			zzir = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #33  <Field String zzir>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #45  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #46  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	static void b(an an1, String s)
	{
		an1.b(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void b(String)>
	//    3    5:return          
	}

	private final void b(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zziq>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #43  <Field int zziq>
			zzis = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #35  <Field String zzis>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #45  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #46  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static ao c()
	{
		return (ao)(eq)((ep) (zziu)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #23  <Field an zziu>
	//    1    3:getstatic       #56  <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #59  <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #61  <Class eq>
	//    6   14:checkcast       #63  <Class ao>
	//    7   17:areturn         
	}

	static void c(an an1, String s)
	{
		an1.c(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void c(String)>
	//    3    5:return          
	}

	private final void c(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 4;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field int zziq>
	//    5    9:iconst_4        
	//    6   10:ior             
	//    7   11:putfield        #43  <Field int zziq>
			zzit = s;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #37  <Field String zzit>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #45  <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #46  <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	public static an d()
	{
		return zziu;
	//    0    0:getstatic       #23  <Field an zziu>
	//    1    3:areturn         
	}

	static an e()
	{
		return zziu;
	//    0    0:getstatic       #23  <Field an zziu>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ap.a[i - 1];
	//    0    0:getstatic       #72  <Field int[] ap.a>
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
		obj = ((Object) (zziv));
	//   15   63:getstatic       #83  <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/an;
	//   19   71:ldc1            #2   <Class an>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #83  <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zziu)))));
	//   27   84:new             #85  <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #23  <Field an zziu>
	//   30   91:invokespecial   #88  <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #83  <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/an;
	//   34   99:ldc1            #2   <Class an>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/an;
	//   39  105:ldc1            #2   <Class an>
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
		return ((Object) (zziu));
	//   45  112:getstatic       #23  <Field an zziu>
	//   46  115:areturn         
_L4:
		return a(((gd) (zziu)), "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\b\001\003\b\002", new Object[] {
			"zziq", "zzir", "zzis", "zzit"
		});
	//   47  116:getstatic       #23  <Field an zziu>
	//   48  119:ldc1            #90  <String "\001\003\000\001\001\003\003\000\000\000\001\b\000\002\b\001\003\b\002">
	//   49  121:iconst_4        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #93  <String "zziq">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #94  <String "zzir">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #95  <String "zzis">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #96  <String "zzit">
	//   66  144:aastore         
	//   67  145:invokestatic    #99  <Method Object a(gd, String, Object[])>
	//   68  148:areturn         
_L3:
		return ((Object) (new ao(((ap) (null)))));
	//   69  149:new             #63  <Class ao>
	//   70  152:dup             
	//   71  153:aconst_null     
	//   72  154:invokespecial   #102 <Method void ao(ap)>
	//   73  157:areturn         
_L2:
		return ((Object) (new an()));
	//   74  158:new             #2   <Class an>
	//   75  161:dup             
	//   76  162:invokespecial   #21  <Method void an()>
	//   77  165:areturn         
	}

	public final boolean a()
	{
		return (zziq & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zziq>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean b()
	{
		return (zziq & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int zziq>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	private static final an zziu;
	private static volatile go zziv;
	private int zziq;
	private String zzir;
	private String zzis;
	private String zzit;

	static 
	{
		zziu = new an();
	//    0    0:new             #2   <Class an>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void an()>
	//    3    7:putstatic       #23  <Field an zziu>
		ep.a(com/google/android/gms/internal/firebase-perf/an, ((ep) (zziu)));
	//    4   10:ldc1            #2   <Class an>
	//    5   12:getstatic       #23  <Field an zziu>
	//    6   15:invokestatic    #27  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
