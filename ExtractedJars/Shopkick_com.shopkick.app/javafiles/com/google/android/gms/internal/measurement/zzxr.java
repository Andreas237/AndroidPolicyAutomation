// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxs

final class zzxr
{

	private static final int zzbul[];

	static 
	{
		zzbul = new int[zzxs.values().length];
	//    0    0:invokestatic    #16  <Method zzxs[] zzxs.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] zzbul>
		try
		{
			zzbul[zzxs.zzcdh.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] zzbul>
	//    5   12:getstatic       #22  <Field zzxs zzxs.zzcdh>
	//    6   15:invokevirtual   #26  <Method int zzxs.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] zzbul>
	//*  10   23:getstatic       #29  <Field zzxs zzxs.zzcdi>
	//*  11   26:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] zzbul>
	//*  15   34:getstatic       #32  <Field zzxs zzxs.zzcdj>
	//*  16   37:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] zzbul>
	//*  20   45:getstatic       #35  <Field zzxs zzxs.zzcdk>
	//*  21   48:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] zzbul>
	//*  25   56:getstatic       #38  <Field zzxs zzxs.zzcdl>
	//*  26   59:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #18  <Field int[] zzbul>
	//*  30   67:getstatic       #41  <Field zzxs zzxs.zzcdm>
	//*  31   70:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #18  <Field int[] zzbul>
	//*  35   79:getstatic       #44  <Field zzxs zzxs.zzcdn>
	//*  36   82:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #18  <Field int[] zzbul>
	//*  40   91:getstatic       #47  <Field zzxs zzxs.zzcdo>
	//*  41   94:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #18  <Field int[] zzbul>
	//*  45  103:getstatic       #50  <Field zzxs zzxs.zzcds>
	//*  46  106:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #18  <Field int[] zzbul>
	//*  50  115:getstatic       #53  <Field zzxs zzxs.zzcdt>
	//*  51  118:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #18  <Field int[] zzbul>
	//*  55  127:getstatic       #56  <Field zzxs zzxs.zzcdv>
	//*  56  130:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #18  <Field int[] zzbul>
	//*  60  139:getstatic       #59  <Field zzxs zzxs.zzcdw>
	//*  61  142:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #18  <Field int[] zzbul>
	//*  65  151:getstatic       #62  <Field zzxs zzxs.zzcdx>
	//*  66  154:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #18  <Field int[] zzbul>
	//*  70  163:getstatic       #65  <Field zzxs zzxs.zzcdy>
	//*  71  166:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #18  <Field int[] zzbul>
	//*  75  175:getstatic       #68  <Field zzxs zzxs.zzcdp>
	//*  76  178:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #18  <Field int[] zzbul>
	//*  80  187:getstatic       #71  <Field zzxs zzxs.zzcdq>
	//*  81  190:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #18  <Field int[] zzbul>
	//*  85  199:getstatic       #74  <Field zzxs zzxs.zzcdr>
	//*  86  202:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #18  <Field int[] zzbul>
	//*  90  211:getstatic       #77  <Field zzxs zzxs.zzcdu>
	//*  91  214:invokevirtual   #26  <Method int zzxs.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   95  221:astore_0        
		try
		{
			zzbul[zzxs.zzcdi.ordinal()] = 2;
		}
	//*  96  222:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   97  225:astore_0        
		try
		{
			zzbul[zzxs.zzcdj.ordinal()] = 3;
		}
	//*  98  226:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   99  229:astore_0        
		try
		{
			zzbul[zzxs.zzcdk.ordinal()] = 4;
		}
	//* 100  230:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  101  233:astore_0        
		try
		{
			zzbul[zzxs.zzcdl.ordinal()] = 5;
		}
	//* 102  234:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  103  237:astore_0        
		try
		{
			zzbul[zzxs.zzcdm.ordinal()] = 6;
		}
	//* 104  238:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  105  241:astore_0        
		try
		{
			zzbul[zzxs.zzcdn.ordinal()] = 7;
		}
	//* 106  242:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  107  245:astore_0        
		try
		{
			zzbul[zzxs.zzcdo.ordinal()] = 8;
		}
	//* 108  246:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  109  249:astore_0        
		try
		{
			zzbul[zzxs.zzcds.ordinal()] = 9;
		}
	//* 110  250:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  111  253:astore_0        
		try
		{
			zzbul[zzxs.zzcdt.ordinal()] = 10;
		}
	//* 112  254:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  113  257:astore_0        
		try
		{
			zzbul[zzxs.zzcdv.ordinal()] = 11;
		}
	//* 114  258:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  115  261:astore_0        
		try
		{
			zzbul[zzxs.zzcdw.ordinal()] = 12;
		}
	//* 116  262:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  117  265:astore_0        
		try
		{
			zzbul[zzxs.zzcdx.ordinal()] = 13;
		}
	//* 118  266:goto            148
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  119  269:astore_0        
		try
		{
			zzbul[zzxs.zzcdy.ordinal()] = 14;
		}
	//* 120  270:goto            160
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  121  273:astore_0        
		try
		{
			zzbul[zzxs.zzcdp.ordinal()] = 15;
		}
	//* 122  274:goto            172
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  123  277:astore_0        
		try
		{
			zzbul[zzxs.zzcdq.ordinal()] = 16;
		}
	//* 124  278:goto            184
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  125  281:astore_0        
		try
		{
			zzbul[zzxs.zzcdr.ordinal()] = 17;
		}
	//* 126  282:goto            196
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  127  285:astore_0        
		try
		{
			zzbul[zzxs.zzcdu.ordinal()] = 18;
		}
	//* 128  286:goto            208
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  129  289:astore_0        
	//* 130  290:return          
	}
}
