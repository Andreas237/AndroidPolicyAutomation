// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;


// Referenced classes of package com.google.android.gms.internal.clearcut:
//			bv, dj, br, ip, 
//			bt, hu, ij, hv, 
//			hn, ht, ds, gt, 
//			cf, ha, hf, gw

public final class hs extends bv
	implements dj
{

	private hs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void bv()>
		zzsf = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #52  <Field byte zzsf>
		zzzg = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #54  <Field int zzzg>
		zzzh = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #56  <String "">
	//   10   17:putfield        #58  <Field String zzzh>
		zzzi = "";
	//   11   20:aload_0         
	//   12   21:ldc1            #56  <String "">
	//   13   23:putfield        #60  <Field String zzzi>
		zzzj = h();
	//   14   26:aload_0         
	//   15   27:invokestatic    #64  <Method cf h()>
	//   16   30:putfield        #66  <Field cf zzzj>
		zzzk = h();
	//   17   33:aload_0         
	//   18   34:invokestatic    #64  <Method cf h()>
	//   19   37:putfield        #68  <Field cf zzzk>
	//   20   40:return          
	}

	static hs a()
	{
		return zzzr;
	//    0    0:getstatic       #42  <Field hs zzzr>
	//    1    3:areturn         
	}

	protected final Object a(int i, Object obj, Object obj1)
	{
		int j;
		j = ip.a[i - 1];
	//    0    0:getstatic       #75  <Field int[] ip.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
	//    5    7:istore          4
		i = 0;
	//    6    9:iconst_0        
	//    7   10:istore_1        
		j;
	//    8   11:iload           4
		JVM INSTR tableswitch 1 7: default 56
	//	               1 284
	//	               2 275
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64;
	//    9   13:tableswitch     1 7: default 56
	//	               1 284
	//	               2 275
	//	               3 142
	//	               4 138
	//	               5 89
	//	               6 81
	//	               7 64
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//   10   56:new             #77  <Class UnsupportedOperationException>
	//   11   59:dup             
	//   12   60:invokespecial   #78  <Method void UnsupportedOperationException()>
	//   13   63:athrow          
_L8:
		if(obj != null)
	//*  14   64:aload_2         
	//*  15   65:ifnonnull       71
	//*  16   68:goto            73
			i = 1;
	//   17   71:iconst_1        
	//   18   72:istore_1        
		zzsf = (byte)i;
	//   19   73:aload_0         
	//   20   74:iload_1         
	//   21   75:int2byte        
	//   22   76:putfield        #52  <Field byte zzsf>
		return ((Object) (null));
	//   23   79:aconst_null     
	//   24   80:areturn         
_L7:
		return ((Object) (Byte.valueOf(zzsf)));
	//   25   81:aload_0         
	//   26   82:getfield        #52  <Field byte zzsf>
	//   27   85:invokestatic    #84  <Method Byte Byte.valueOf(byte)>
	//   28   88:areturn         
_L6:
		obj = ((Object) (zzbg));
	//   29   89:getstatic       #86  <Field ds zzbg>
	//   30   92:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   31   93:aload_2         
	//   32   94:ifnonnull       136
_L9:
		com/google/android/gms/internal/clearcut/hs;
	//   33   97:ldc1            #2   <Class hs>
		JVM INSTR monitorenter ;
	//   34   99:monitorenter    
		obj1 = ((Object) (zzbg));
	//   35  100:getstatic       #86  <Field ds zzbg>
	//   36  103:astore_3        
		obj = obj1;
	//   37  104:aload_3         
	//   38  105:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   39  106:aload_3         
	//   40  107:ifnonnull       125
_L11:
		obj = ((Object) (new bt(((br) (zzzr)))));
	//   41  110:new             #88  <Class bt>
	//   42  113:dup             
	//   43  114:getstatic       #42  <Field hs zzzr>
	//   44  117:invokespecial   #91  <Method void bt(br)>
	//   45  120:astore_2        
		zzbg = ((ds) (obj));
	//   46  121:aload_2         
	//   47  122:putstatic       #86  <Field ds zzbg>
_L12:
		com/google/android/gms/internal/clearcut/hs;
	//   48  125:ldc1            #2   <Class hs>
		JVM INSTR monitorexit ;
	//   49  127:monitorexit     
		return obj;
	//   50  128:aload_2         
	//   51  129:areturn         
		obj;
	//   52  130:astore_2        
		com/google/android/gms/internal/clearcut/hs;
	//   53  131:ldc1            #2   <Class hs>
		JVM INSTR monitorexit ;
	//   54  133:monitorexit     
		throw obj;
	//   55  134:aload_2         
	//   56  135:athrow          
_L10:
		return obj;
	//   57  136:aload_2         
	//   58  137:areturn         
_L5:
		return ((Object) (zzzr));
	//   59  138:getstatic       #42  <Field hs zzzr>
	//   60  141:areturn         
_L4:
		obj = ((Object) (hu.b()));
	//   61  142:invokestatic    #97  <Method cc hu.b()>
	//   62  145:astore_2        
		obj1 = ((Object) (ij.b()));
	//   63  146:invokestatic    #100 <Method cc ij.b()>
	//   64  149:astore_3        
		cc cc = hv.b();
	//   65  150:invokestatic    #103 <Method cc hv.b()>
	//   66  153:astore          5
		return a(((dh) (zzzr)), "\001\016\000\001\001\016\016\017\000\002\002\001\u0409\002\002\f\003\003\u041B\004\002\000\005\034\006\b\004\007\b\005\b\002\001\t\f\007\n\f\b\013\t\t\f\t\n\r\t\013\016\002\006", new Object[] {
			"zzbb", "zzzf", "zzzg", obj, "zzzj", com/google/android/gms/internal/clearcut/hn, "zzzd", "zzzk", "zzzh", "zzzi", 
			"zzze", "zzzm", obj1, "zzzn", cc, "zzzo", "zzzp", "zzzq", "zzzl"
		});
	//   67  155:getstatic       #42  <Field hs zzzr>
	//   68  158:ldc1            #105 <String "\001\016\000\001\001\016\016\017\000\002\002\001\u0409\002\002\f\003\003\u041B\004\002\000\005\034\006\b\004\007\b\005\b\002\001\t\f\007\n\f\b\013\t\t\f\t\n\r\t\013\016\002\006">
	//   69  160:bipush          19
	//   70  162:anewarray       Object[]
	//   71  165:dup             
	//   72  166:iconst_0        
	//   73  167:ldc1            #108 <String "zzbb">
	//   74  169:aastore         
	//   75  170:dup             
	//   76  171:iconst_1        
	//   77  172:ldc1            #109 <String "zzzf">
	//   78  174:aastore         
	//   79  175:dup             
	//   80  176:iconst_2        
	//   81  177:ldc1            #110 <String "zzzg">
	//   82  179:aastore         
	//   83  180:dup             
	//   84  181:iconst_3        
	//   85  182:aload_2         
	//   86  183:aastore         
	//   87  184:dup             
	//   88  185:iconst_4        
	//   89  186:ldc1            #111 <String "zzzj">
	//   90  188:aastore         
	//   91  189:dup             
	//   92  190:iconst_5        
	//   93  191:ldc1            #113 <Class hn>
	//   94  193:aastore         
	//   95  194:dup             
	//   96  195:bipush          6
	//   97  197:ldc1            #114 <String "zzzd">
	//   98  199:aastore         
	//   99  200:dup             
	//  100  201:bipush          7
	//  101  203:ldc1            #115 <String "zzzk">
	//  102  205:aastore         
	//  103  206:dup             
	//  104  207:bipush          8
	//  105  209:ldc1            #116 <String "zzzh">
	//  106  211:aastore         
	//  107  212:dup             
	//  108  213:bipush          9
	//  109  215:ldc1            #117 <String "zzzi">
	//  110  217:aastore         
	//  111  218:dup             
	//  112  219:bipush          10
	//  113  221:ldc1            #118 <String "zzze">
	//  114  223:aastore         
	//  115  224:dup             
	//  116  225:bipush          11
	//  117  227:ldc1            #119 <String "zzzm">
	//  118  229:aastore         
	//  119  230:dup             
	//  120  231:bipush          12
	//  121  233:aload_3         
	//  122  234:aastore         
	//  123  235:dup             
	//  124  236:bipush          13
	//  125  238:ldc1            #120 <String "zzzn">
	//  126  240:aastore         
	//  127  241:dup             
	//  128  242:bipush          14
	//  129  244:aload           5
	//  130  246:aastore         
	//  131  247:dup             
	//  132  248:bipush          15
	//  133  250:ldc1            #121 <String "zzzo">
	//  134  252:aastore         
	//  135  253:dup             
	//  136  254:bipush          16
	//  137  256:ldc1            #122 <String "zzzp">
	//  138  258:aastore         
	//  139  259:dup             
	//  140  260:bipush          17
	//  141  262:ldc1            #123 <String "zzzq">
	//  142  264:aastore         
	//  143  265:dup             
	//  144  266:bipush          18
	//  145  268:ldc1            #124 <String "zzzl">
	//  146  270:aastore         
	//  147  271:invokestatic    #127 <Method Object a(dh, String, Object[])>
	//  148  274:areturn         
_L3:
		return ((Object) (new ht(((ip) (null)))));
	//  149  275:new             #129 <Class ht>
	//  150  278:dup             
	//  151  279:aconst_null     
	//  152  280:invokespecial   #132 <Method void ht(ip)>
	//  153  283:areturn         
_L2:
		return ((Object) (new hs()));
	//  154  284:new             #2   <Class hs>
	//  155  287:dup             
	//  156  288:invokespecial   #40  <Method void hs()>
	//  157  291:areturn         
	}

	private static volatile ds zzbg;
	private static final hs zzzr;
	private int zzbb;
	private byte zzsf;
	private long zzzd;
	private long zzze;
	private gt zzzf;
	private int zzzg;
	private String zzzh;
	private String zzzi;
	private cf zzzj;
	private cf zzzk;
	private long zzzl;
	private int zzzm;
	private int zzzn;
	private ha zzzo;
	private hf zzzp;
	private gw zzzq;

	static 
	{
		zzzr = new hs();
	//    0    0:new             #2   <Class hs>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void hs()>
	//    3    7:putstatic       #42  <Field hs zzzr>
		br.a(com/google/android/gms/internal/clearcut/hs, ((br) (zzzr)));
	//    4   10:ldc1            #2   <Class hs>
	//    5   12:getstatic       #42  <Field hs zzzr>
	//    6   15:invokestatic    #48  <Method void br.a(Class, br)>
	//*   7   18:return          
	}
}
