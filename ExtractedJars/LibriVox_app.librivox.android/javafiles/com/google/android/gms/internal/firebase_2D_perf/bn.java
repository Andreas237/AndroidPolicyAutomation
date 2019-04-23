// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, bp, er, 
//			bo, go, in

public final class bn extends ep
	implements gg
{

	private bn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ep()>
		zzis = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzis>
		zzkm = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #33  <String "">
	//    7   13:putfield        #37  <Field String zzkm>
		zzkn = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #33  <String "">
	//   10   19:putfield        #39  <Field String zzkn>
	//   11   22:return          
	}

	static bn a()
	{
		return zzkp;
	//    0    0:getstatic       #25  <Field bn zzkp>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		bp.a[i - 1];
	//    0    0:getstatic       #46  <Field int[] bp.a>
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
	//    6   48:new             #48  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #49  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #55  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #57  <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/bn;
	//   19   71:ldc1            #2   <Class bn>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #57  <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzkp)))));
	//   27   84:new             #59  <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field bn zzkp>
	//   30   91:invokespecial   #62  <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #57  <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/bn;
	//   34   99:ldc1            #2   <Class bn>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/bn;
	//   39  105:ldc1            #2   <Class bn>
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
		return ((Object) (zzkp));
	//   45  112:getstatic       #25  <Field bn zzkp>
	//   46  115:areturn         
_L4:
		return a(((gd) (zzkp)), "\001\004\000\001\002\005\004\000\000\000\002\b\000\003\b\001\004\b\002\005\t\003", new Object[] {
			"zziq", "zzis", "zzkm", "zzkn", "zzko"
		});
	//   47  116:getstatic       #25  <Field bn zzkp>
	//   48  119:ldc1            #64  <String "\001\004\000\001\002\005\004\000\000\000\002\b\000\003\b\001\004\b\002\005\t\003">
	//   49  121:iconst_5        
	//   50  122:anewarray       Object[]
	//   51  125:dup             
	//   52  126:iconst_0        
	//   53  127:ldc1            #67  <String "zziq">
	//   54  129:aastore         
	//   55  130:dup             
	//   56  131:iconst_1        
	//   57  132:ldc1            #68  <String "zzis">
	//   58  134:aastore         
	//   59  135:dup             
	//   60  136:iconst_2        
	//   61  137:ldc1            #69  <String "zzkm">
	//   62  139:aastore         
	//   63  140:dup             
	//   64  141:iconst_3        
	//   65  142:ldc1            #70  <String "zzkn">
	//   66  144:aastore         
	//   67  145:dup             
	//   68  146:iconst_4        
	//   69  147:ldc1            #71  <String "zzko">
	//   70  149:aastore         
	//   71  150:invokestatic    #74  <Method Object a(gd, String, Object[])>
	//   72  153:areturn         
_L3:
		return ((Object) (new bo(((bp) (null)))));
	//   73  154:new             #76  <Class bo>
	//   74  157:dup             
	//   75  158:aconst_null     
	//   76  159:invokespecial   #79  <Method void bo(bp)>
	//   77  162:areturn         
_L2:
		return ((Object) (new bn()));
	//   78  163:new             #2   <Class bn>
	//   79  166:dup             
	//   80  167:invokespecial   #23  <Method void bn()>
	//   81  170:areturn         
	}

	private static volatile go zziv;
	private static final bn zzkp;
	private int zziq;
	private String zzis;
	private String zzkm;
	private String zzkn;
	private in zzko;

	static 
	{
		zzkp = new bn();
	//    0    0:new             #2   <Class bn>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void bn()>
	//    3    7:putstatic       #25  <Field bn zzkp>
		ep.a(com/google/android/gms/internal/firebase-perf/bn, ((ep) (zzkp)));
	//    4   10:ldc1            #2   <Class bn>
	//    5   12:getstatic       #25  <Field bn zzkp>
	//    6   15:invokestatic    #29  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
