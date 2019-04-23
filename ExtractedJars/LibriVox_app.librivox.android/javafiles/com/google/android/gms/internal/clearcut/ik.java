// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			im, il, ds

public final class ik extends br
	implements dj
{

	private ik()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void br()>
		zzbhr = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #38  <String "">
	//    4    7:putfield        #40  <Field String zzbhr>
		zzte = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #38  <String "">
	//    7   13:putfield        #42  <Field String zzte>
		zzbhs = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #38  <String "">
	//   10   19:putfield        #44  <Field String zzbhs>
		zzta = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #38  <String "">
	//   13   25:putfield        #46  <Field String zzta>
		zzsr = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #38  <String "">
	//   16   31:putfield        #48  <Field String zzsr>
		zzbht = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #38  <String "">
	//   19   37:putfield        #50  <Field String zzbht>
		zzsz = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #38  <String "">
	//   22   43:putfield        #52  <Field String zzsz>
		zzbhu = "";
	//   23   46:aload_0         
	//   24   47:ldc1            #38  <String "">
	//   25   49:putfield        #54  <Field String zzbhu>
		zzbhv = "";
	//   26   52:aload_0         
	//   27   53:ldc1            #38  <String "">
	//   28   55:putfield        #56  <Field String zzbhv>
	//   29   58:return          
	}

	static ik a()
	{
		return zzbhw;
	//    0    0:getstatic       #30  <Field ik zzbhw>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #63  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 208
	//	               2 199
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 208
	//	               2 199
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #65  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #66  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #72  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #74  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/ik;
	//   19   71:ldc1            #2   <Class ik>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #74  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzbhw)))));
	//   27   84:new             #76  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #30  <Field ik zzbhw>
	//   30   91:invokespecial   #79  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #74  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/ik;
	//   34   99:ldc1            #2   <Class ik>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/ik;
	//   39  105:ldc1            #2   <Class ik>
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
		return ((Object) (zzbhw));
	//   45  112:getstatic       #30  <Field ik zzbhw>
	//   46  115:areturn         
_L4:
		obj = ((Object) (im.b()));
	//   47  116:invokestatic    #85  <Method cc im.b()>
	//   48  119:astore_2        
		return a(((dh) (zzbhw)), "\001\n\000\001\001\n\n\013\000\000\000\001\f\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\b\007\t\b\b\n\b\t", new Object[] {
			"zzbb", "zzbhq", obj, "zzbhr", "zzte", "zzbhs", "zzta", "zzsr", "zzbht", "zzsz", 
			"zzbhu", "zzbhv"
		});
	//   49  120:getstatic       #30  <Field ik zzbhw>
	//   50  123:ldc1            #87  <String "\001\n\000\001\001\n\n\013\000\000\000\001\f\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\005\007\b\006\b\b\007\t\b\b\n\b\t">
	//   51  125:bipush          12
	//   52  127:anewarray       Object[]
	//   53  130:dup             
	//   54  131:iconst_0        
	//   55  132:ldc1            #90  <String "zzbb">
	//   56  134:aastore         
	//   57  135:dup             
	//   58  136:iconst_1        
	//   59  137:ldc1            #91  <String "zzbhq">
	//   60  139:aastore         
	//   61  140:dup             
	//   62  141:iconst_2        
	//   63  142:aload_2         
	//   64  143:aastore         
	//   65  144:dup             
	//   66  145:iconst_3        
	//   67  146:ldc1            #92  <String "zzbhr">
	//   68  148:aastore         
	//   69  149:dup             
	//   70  150:iconst_4        
	//   71  151:ldc1            #93  <String "zzte">
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_5        
	//   75  156:ldc1            #94  <String "zzbhs">
	//   76  158:aastore         
	//   77  159:dup             
	//   78  160:bipush          6
	//   79  162:ldc1            #95  <String "zzta">
	//   80  164:aastore         
	//   81  165:dup             
	//   82  166:bipush          7
	//   83  168:ldc1            #96  <String "zzsr">
	//   84  170:aastore         
	//   85  171:dup             
	//   86  172:bipush          8
	//   87  174:ldc1            #97  <String "zzbht">
	//   88  176:aastore         
	//   89  177:dup             
	//   90  178:bipush          9
	//   91  180:ldc1            #98  <String "zzsz">
	//   92  182:aastore         
	//   93  183:dup             
	//   94  184:bipush          10
	//   95  186:ldc1            #99  <String "zzbhu">
	//   96  188:aastore         
	//   97  189:dup             
	//   98  190:bipush          11
	//   99  192:ldc1            #100 <String "zzbhv">
	//  100  194:aastore         
	//  101  195:invokestatic    #103 <Method Object a(dh, String, Object[])>
	//  102  198:areturn         
_L3:
		return ((Object) (new il(((ip) (null)))));
	//  103  199:new             #105 <Class il>
	//  104  202:dup             
	//  105  203:aconst_null     
	//  106  204:invokespecial   #108 <Method void il(ip)>
	//  107  207:areturn         
_L2:
		return ((Object) (new ik()));
	//  108  208:new             #2   <Class ik>
	//  109  211:dup             
	//  110  212:invokespecial   #28  <Method void ik()>
	//  111  215:areturn         
	}

	private static volatile ds zzbg;
	private static final ik zzbhw;
	private int zzbb;
	private int zzbhq;
	private String zzbhr;
	private String zzbhs;
	private String zzbht;
	private String zzbhu;
	private String zzbhv;
	private String zzsr;
	private String zzsz;
	private String zzta;
	private String zzte;

	static 
	{
		zzbhw = new ik();
	//    0    0:new             #2   <Class ik>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ik()>
	//    3    7:putstatic       #30  <Field ik zzbhw>
		br.a(com/google/android/gms/internal/clearcut/ik, ((br) (zzbhw)));
	//    4   10:ldc1            #2   <Class ik>
	//    5   12:getstatic       #30  <Field ik zzbhw>
	//    6   15:invokestatic    #34  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
