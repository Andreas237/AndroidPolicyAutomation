// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;


// Referenced classes of package com.google.android.gms.internal.vision:
//			zzjd

final class zzjc
{

	private static final int zzrr[];

	static 
	{
		zzrr = new int[zzjd.values().length];
	//    0    0:invokestatic    #16  <Method zzjd[] zzjd.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] zzrr>
		try
		{
			zzrr[zzjd.zzabu.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] zzrr>
	//    5   12:getstatic       #22  <Field zzjd zzjd.zzabu>
	//    6   15:invokevirtual   #26  <Method int zzjd.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] zzrr>
	//*  10   23:getstatic       #29  <Field zzjd zzjd.zzabv>
	//*  11   26:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] zzrr>
	//*  15   34:getstatic       #32  <Field zzjd zzjd.zzabw>
	//*  16   37:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] zzrr>
	//*  20   45:getstatic       #35  <Field zzjd zzjd.zzabx>
	//*  21   48:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] zzrr>
	//*  25   56:getstatic       #38  <Field zzjd zzjd.zzaby>
	//*  26   59:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #18  <Field int[] zzrr>
	//*  30   67:getstatic       #41  <Field zzjd zzjd.zzabz>
	//*  31   70:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #18  <Field int[] zzrr>
	//*  35   79:getstatic       #44  <Field zzjd zzjd.zzaca>
	//*  36   82:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #18  <Field int[] zzrr>
	//*  40   91:getstatic       #47  <Field zzjd zzjd.zzacb>
	//*  41   94:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #18  <Field int[] zzrr>
	//*  45  103:getstatic       #50  <Field zzjd zzjd.zzacf>
	//*  46  106:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #18  <Field int[] zzrr>
	//*  50  115:getstatic       #53  <Field zzjd zzjd.zzacg>
	//*  51  118:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #18  <Field int[] zzrr>
	//*  55  127:getstatic       #56  <Field zzjd zzjd.zzaci>
	//*  56  130:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #18  <Field int[] zzrr>
	//*  60  139:getstatic       #59  <Field zzjd zzjd.zzacj>
	//*  61  142:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #18  <Field int[] zzrr>
	//*  65  151:getstatic       #62  <Field zzjd zzjd.zzack>
	//*  66  154:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #18  <Field int[] zzrr>
	//*  70  163:getstatic       #65  <Field zzjd zzjd.zzacl>
	//*  71  166:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #18  <Field int[] zzrr>
	//*  75  175:getstatic       #68  <Field zzjd zzjd.zzacc>
	//*  76  178:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #18  <Field int[] zzrr>
	//*  80  187:getstatic       #71  <Field zzjd zzjd.zzacd>
	//*  81  190:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #18  <Field int[] zzrr>
	//*  85  199:getstatic       #74  <Field zzjd zzjd.zzace>
	//*  86  202:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #18  <Field int[] zzrr>
	//*  90  211:getstatic       #77  <Field zzjd zzjd.zzach>
	//*  91  214:invokevirtual   #26  <Method int zzjd.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   95  221:astore_0        
		try
		{
			zzrr[zzjd.zzabv.ordinal()] = 2;
		}
	//*  96  222:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   97  225:astore_0        
		try
		{
			zzrr[zzjd.zzabw.ordinal()] = 3;
		}
	//*  98  226:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   99  229:astore_0        
		try
		{
			zzrr[zzjd.zzabx.ordinal()] = 4;
		}
	//* 100  230:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  101  233:astore_0        
		try
		{
			zzrr[zzjd.zzaby.ordinal()] = 5;
		}
	//* 102  234:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  103  237:astore_0        
		try
		{
			zzrr[zzjd.zzabz.ordinal()] = 6;
		}
	//* 104  238:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  105  241:astore_0        
		try
		{
			zzrr[zzjd.zzaca.ordinal()] = 7;
		}
	//* 106  242:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  107  245:astore_0        
		try
		{
			zzrr[zzjd.zzacb.ordinal()] = 8;
		}
	//* 108  246:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  109  249:astore_0        
		try
		{
			zzrr[zzjd.zzacf.ordinal()] = 9;
		}
	//* 110  250:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  111  253:astore_0        
		try
		{
			zzrr[zzjd.zzacg.ordinal()] = 10;
		}
	//* 112  254:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  113  257:astore_0        
		try
		{
			zzrr[zzjd.zzaci.ordinal()] = 11;
		}
	//* 114  258:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  115  261:astore_0        
		try
		{
			zzrr[zzjd.zzacj.ordinal()] = 12;
		}
	//* 116  262:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  117  265:astore_0        
		try
		{
			zzrr[zzjd.zzack.ordinal()] = 13;
		}
	//* 118  266:goto            148
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  119  269:astore_0        
		try
		{
			zzrr[zzjd.zzacl.ordinal()] = 14;
		}
	//* 120  270:goto            160
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  121  273:astore_0        
		try
		{
			zzrr[zzjd.zzacc.ordinal()] = 15;
		}
	//* 122  274:goto            172
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  123  277:astore_0        
		try
		{
			zzrr[zzjd.zzacd.ordinal()] = 16;
		}
	//* 124  278:goto            184
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  125  281:astore_0        
		try
		{
			zzrr[zzjd.zzace.ordinal()] = 17;
		}
	//* 126  282:goto            196
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  127  285:astore_0        
		try
		{
			zzrr[zzjd.zzach.ordinal()] = 18;
		}
	//* 128  286:goto            208
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  129  289:astore_0        
	//* 130  290:return          
	}
}
