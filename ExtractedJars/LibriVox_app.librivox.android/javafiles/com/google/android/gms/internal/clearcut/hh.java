// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			br, dj, ip, bt, 
//			hi, ds

public final class hh extends br
	implements dj
{

	private hh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void br()>
		zzvy = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #40  <String "">
	//    4    7:putfield        #42  <Field String zzvy>
		zzso = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #40  <String "">
	//    7   13:putfield        #44  <Field String zzso>
		zzwa = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #40  <String "">
	//   10   19:putfield        #46  <Field String zzwa>
		zzwb = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #40  <String "">
	//   13   25:putfield        #48  <Field String zzwb>
		zzsw = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #40  <String "">
	//   16   31:putfield        #50  <Field String zzsw>
		zzwx = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #40  <String "">
	//   19   37:putfield        #52  <Field String zzwx>
		zzsz = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #40  <String "">
	//   22   43:putfield        #54  <Field String zzsz>
		zzsr = "";
	//   23   46:aload_0         
	//   24   47:ldc1            #40  <String "">
	//   25   49:putfield        #56  <Field String zzsr>
		zzwy = "";
	//   26   52:aload_0         
	//   27   53:ldc1            #40  <String "">
	//   28   55:putfield        #58  <Field String zzwy>
		zzwz = "";
	//   29   58:aload_0         
	//   30   59:ldc1            #40  <String "">
	//   31   61:putfield        #60  <Field String zzwz>
	//   32   64:return          
	}

	static hh a()
	{
		return zzxa;
	//    0    0:getstatic       #32  <Field hh zzxa>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		ip.a[i - 1];
	//    0    0:getstatic       #67  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 211
	//	               2 202
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 211
	//	               2 202
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #69  <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #70  <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #76  <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   15   63:getstatic       #78  <Field ds zzbg>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/clearcut/hh;
	//   19   71:ldc1            #2   <Class hh>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zzbg));
	//   21   74:getstatic       #78  <Field ds zzbg>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new bt(((br) (zzxa)))));
	//   27   84:new             #80  <Class bt>
	//   28   87:dup             
	//   29   88:getstatic       #32  <Field hh zzxa>
	//   30   91:invokespecial   #83  <Method void bt(br)>
	//   31   94:astore_2        
		zzbg = ((ds) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #78  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hh;
	//   34   99:ldc1            #2   <Class hh>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/clearcut/hh;
	//   39  105:ldc1            #2   <Class hh>
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
		return ((Object) (zzxa));
	//   45  112:getstatic       #32  <Field hh zzxa>
	//   46  115:areturn         
_L4:
		return a(((dh) (zzxa)), "\001\f\000\001\001\f\f\r\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\006\007\b\007\b\b\b\t\004\t\n\004\n\013\b\013\f\b\005", new Object[] {
			"zzbb", "zzvy", "zzso", "zzwa", "zzwb", "zzsw", "zzsz", "zzsr", "zzwy", "zzwc", 
			"zzwd", "zzwz", "zzwx"
		});
	//   47  116:getstatic       #32  <Field hh zzxa>
	//   48  119:ldc1            #85  <String "\001\f\000\001\001\f\f\r\000\000\000\001\b\000\002\b\001\003\b\002\004\b\003\005\b\004\006\b\006\007\b\007\b\b\b\t\004\t\n\004\n\013\b\013\f\b\005">
	//   49  121:bipush          13
	//   50  123:anewarray       Object[]
	//   51  126:dup             
	//   52  127:iconst_0        
	//   53  128:ldc1            #88  <String "zzbb">
	//   54  130:aastore         
	//   55  131:dup             
	//   56  132:iconst_1        
	//   57  133:ldc1            #89  <String "zzvy">
	//   58  135:aastore         
	//   59  136:dup             
	//   60  137:iconst_2        
	//   61  138:ldc1            #90  <String "zzso">
	//   62  140:aastore         
	//   63  141:dup             
	//   64  142:iconst_3        
	//   65  143:ldc1            #91  <String "zzwa">
	//   66  145:aastore         
	//   67  146:dup             
	//   68  147:iconst_4        
	//   69  148:ldc1            #92  <String "zzwb">
	//   70  150:aastore         
	//   71  151:dup             
	//   72  152:iconst_5        
	//   73  153:ldc1            #93  <String "zzsw">
	//   74  155:aastore         
	//   75  156:dup             
	//   76  157:bipush          6
	//   77  159:ldc1            #94  <String "zzsz">
	//   78  161:aastore         
	//   79  162:dup             
	//   80  163:bipush          7
	//   81  165:ldc1            #95  <String "zzsr">
	//   82  167:aastore         
	//   83  168:dup             
	//   84  169:bipush          8
	//   85  171:ldc1            #96  <String "zzwy">
	//   86  173:aastore         
	//   87  174:dup             
	//   88  175:bipush          9
	//   89  177:ldc1            #97  <String "zzwc">
	//   90  179:aastore         
	//   91  180:dup             
	//   92  181:bipush          10
	//   93  183:ldc1            #98  <String "zzwd">
	//   94  185:aastore         
	//   95  186:dup             
	//   96  187:bipush          11
	//   97  189:ldc1            #99  <String "zzwz">
	//   98  191:aastore         
	//   99  192:dup             
	//  100  193:bipush          12
	//  101  195:ldc1            #100 <String "zzwx">
	//  102  197:aastore         
	//  103  198:invokestatic    #103 <Method Object a(dh, String, Object[])>
	//  104  201:areturn         
_L3:
		return ((Object) (new hi(((ip) (null)))));
	//  105  202:new             #105 <Class hi>
	//  106  205:dup             
	//  107  206:aconst_null     
	//  108  207:invokespecial   #108 <Method void hi(ip)>
	//  109  210:areturn         
_L2:
		return ((Object) (new hh()));
	//  110  211:new             #2   <Class hh>
	//  111  214:dup             
	//  112  215:invokespecial   #30  <Method void hh()>
	//  113  218:areturn         
	}

	private static volatile ds zzbg;
	private static final hh zzxa;
	private int zzbb;
	private String zzso;
	private String zzsr;
	private String zzsw;
	private String zzsz;
	private String zzvy;
	private String zzwa;
	private String zzwb;
	private int zzwc;
	private int zzwd;
	private String zzwx;
	private String zzwy;
	private String zzwz;

	static 
	{
		zzxa = new hh();
	//    0    0:new             #2   <Class hh>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void hh()>
	//    3    7:putstatic       #32  <Field hh zzxa>
		br.a(com/google/android/gms/internal/clearcut/hh, ((br) (zzxa)));
	//    4   10:ldc1            #2   <Class hh>
	//    5   12:getstatic       #32  <Field hh zzxa>
	//    6   15:invokestatic    #36  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
