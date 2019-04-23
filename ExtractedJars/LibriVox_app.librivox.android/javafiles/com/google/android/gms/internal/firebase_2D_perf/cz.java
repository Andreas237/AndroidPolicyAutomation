// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, db, er, 
//			ck, cw, bd, da, 
//			go

public final class cz extends ep
	implements gg
{

	private cz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void ep()>
		zzis = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #33  <String "">
	//    4    7:putfield        #35  <Field String zzis>
		zzmw = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #33  <String "">
	//    7   13:putfield        #37  <Field String zzmw>
	//    8   16:return          
	}

	static cz a()
	{
		return zzna;
	//    0    0:getstatic       #25  <Field cz zzna>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		db.a[i - 1];
	//    0    0:getstatic       #44  <Field int[] db.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 198
	//	               2 189
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 198
	//	               2 189
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #46  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #47  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #53  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #55  <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/cz;
	//   19   71:ldc1            #2   <Class cz>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #55  <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzna)))));
	//   27   84:new             #57  <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #25  <Field cz zzna>
	//   30   91:invokespecial   #60  <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #55  <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/cz;
	//   34   99:ldc1            #2   <Class cz>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/cz;
	//   39  105:ldc1            #2   <Class cz>
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
		return ((Object) (zzna));
	//   45  112:getstatic       #25  <Field cz zzna>
	//   46  115:areturn         
_L4:
		obj = ((Object) (ck.b()));
	//   47  116:invokestatic    #66  <Method ey ck.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (cw.b()));
	//   49  120:invokestatic    #69  <Method ey cw.b()>
	//   50  123:astore_3        
		ey ey = bd.b();
	//   51  124:invokestatic    #72  <Method ey bd.b()>
	//   52  127:astore          4
		return a(((gd) (zzna)), "\001\005\000\001\001\005\005\000\000\000\001\b\000\002\b\001\003\f\002\004\f\003\005\f\004", new Object[] {
			"zziq", "zzis", "zzmw", "zzmx", obj, "zzmy", obj1, "zzmz", ey
		});
	//   53  129:getstatic       #25  <Field cz zzna>
	//   54  132:ldc1            #74  <String "\001\005\000\001\001\005\005\000\000\000\001\b\000\002\b\001\003\f\002\004\f\003\005\f\004">
	//   55  134:bipush          9
	//   56  136:anewarray       Object[]
	//   57  139:dup             
	//   58  140:iconst_0        
	//   59  141:ldc1            #77  <String "zziq">
	//   60  143:aastore         
	//   61  144:dup             
	//   62  145:iconst_1        
	//   63  146:ldc1            #78  <String "zzis">
	//   64  148:aastore         
	//   65  149:dup             
	//   66  150:iconst_2        
	//   67  151:ldc1            #79  <String "zzmw">
	//   68  153:aastore         
	//   69  154:dup             
	//   70  155:iconst_3        
	//   71  156:ldc1            #80  <String "zzmx">
	//   72  158:aastore         
	//   73  159:dup             
	//   74  160:iconst_4        
	//   75  161:aload_2         
	//   76  162:aastore         
	//   77  163:dup             
	//   78  164:iconst_5        
	//   79  165:ldc1            #81  <String "zzmy">
	//   80  167:aastore         
	//   81  168:dup             
	//   82  169:bipush          6
	//   83  171:aload_3         
	//   84  172:aastore         
	//   85  173:dup             
	//   86  174:bipush          7
	//   87  176:ldc1            #82  <String "zzmz">
	//   88  178:aastore         
	//   89  179:dup             
	//   90  180:bipush          8
	//   91  182:aload           4
	//   92  184:aastore         
	//   93  185:invokestatic    #85  <Method Object a(gd, String, Object[])>
	//   94  188:areturn         
_L3:
		return ((Object) (new da(((db) (null)))));
	//   95  189:new             #87  <Class da>
	//   96  192:dup             
	//   97  193:aconst_null     
	//   98  194:invokespecial   #90  <Method void da(db)>
	//   99  197:areturn         
_L2:
		return ((Object) (new cz()));
	//  100  198:new             #2   <Class cz>
	//  101  201:dup             
	//  102  202:invokespecial   #23  <Method void cz()>
	//  103  205:areturn         
	}

	private static volatile go zziv;
	private static final cz zzna;
	private int zziq;
	private String zzis;
	private String zzmw;
	private int zzmx;
	private int zzmy;
	private int zzmz;

	static 
	{
		zzna = new cz();
	//    0    0:new             #2   <Class cz>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void cz()>
	//    3    7:putstatic       #25  <Field cz zzna>
		ep.a(com/google/android/gms/internal/firebase-perf/cz, ((ep) (zzna)));
	//    4   10:ldc1            #2   <Class cz>
	//    5   12:getstatic       #25  <Field cz zzna>
	//    6   15:invokestatic    #29  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
