// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			avz

final class avy
{

	private static final int a[];

	static 
	{
		a = new int[avz.values().length];
	//    0    0:invokestatic    #16  <Method avz[] avz.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #18  <Field int[] a>
		try
		{
			a[avz.a.ordinal()] = 1;
	//    4    9:getstatic       #18  <Field int[] a>
	//    5   12:getstatic       #21  <Field avz avz.a>
	//    6   15:invokevirtual   #25  <Method int avz.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #18  <Field int[] a>
	//*  10   23:getstatic       #28  <Field avz avz.b>
	//*  11   26:invokevirtual   #25  <Method int avz.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #18  <Field int[] a>
	//*  15   34:getstatic       #31  <Field avz avz.c>
	//*  16   37:invokevirtual   #25  <Method int avz.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #18  <Field int[] a>
	//*  20   45:getstatic       #34  <Field avz avz.d>
	//*  21   48:invokevirtual   #25  <Method int avz.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #18  <Field int[] a>
	//*  25   56:getstatic       #37  <Field avz avz.e>
	//*  26   59:invokevirtual   #25  <Method int avz.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #18  <Field int[] a>
	//*  30   67:getstatic       #40  <Field avz avz.f>
	//*  31   70:invokevirtual   #25  <Method int avz.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #18  <Field int[] a>
	//*  35   79:getstatic       #43  <Field avz avz.g>
	//*  36   82:invokevirtual   #25  <Method int avz.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:getstatic       #18  <Field int[] a>
	//*  40   91:getstatic       #46  <Field avz avz.h>
	//*  41   94:invokevirtual   #25  <Method int avz.ordinal()>
	//*  42   97:bipush          8
	//*  43   99:iastore         
	//*  44  100:getstatic       #18  <Field int[] a>
	//*  45  103:getstatic       #49  <Field avz avz.l>
	//*  46  106:invokevirtual   #25  <Method int avz.ordinal()>
	//*  47  109:bipush          9
	//*  48  111:iastore         
	//*  49  112:getstatic       #18  <Field int[] a>
	//*  50  115:getstatic       #52  <Field avz avz.m>
	//*  51  118:invokevirtual   #25  <Method int avz.ordinal()>
	//*  52  121:bipush          10
	//*  53  123:iastore         
	//*  54  124:getstatic       #18  <Field int[] a>
	//*  55  127:getstatic       #55  <Field avz avz.o>
	//*  56  130:invokevirtual   #25  <Method int avz.ordinal()>
	//*  57  133:bipush          11
	//*  58  135:iastore         
	//*  59  136:getstatic       #18  <Field int[] a>
	//*  60  139:getstatic       #58  <Field avz avz.p>
	//*  61  142:invokevirtual   #25  <Method int avz.ordinal()>
	//*  62  145:bipush          12
	//*  63  147:iastore         
	//*  64  148:getstatic       #18  <Field int[] a>
	//*  65  151:getstatic       #61  <Field avz avz.q>
	//*  66  154:invokevirtual   #25  <Method int avz.ordinal()>
	//*  67  157:bipush          13
	//*  68  159:iastore         
	//*  69  160:getstatic       #18  <Field int[] a>
	//*  70  163:getstatic       #64  <Field avz avz.r>
	//*  71  166:invokevirtual   #25  <Method int avz.ordinal()>
	//*  72  169:bipush          14
	//*  73  171:iastore         
	//*  74  172:getstatic       #18  <Field int[] a>
	//*  75  175:getstatic       #67  <Field avz avz.i>
	//*  76  178:invokevirtual   #25  <Method int avz.ordinal()>
	//*  77  181:bipush          15
	//*  78  183:iastore         
	//*  79  184:getstatic       #18  <Field int[] a>
	//*  80  187:getstatic       #70  <Field avz avz.j>
	//*  81  190:invokevirtual   #25  <Method int avz.ordinal()>
	//*  82  193:bipush          16
	//*  83  195:iastore         
	//*  84  196:getstatic       #18  <Field int[] a>
	//*  85  199:getstatic       #73  <Field avz avz.k>
	//*  86  202:invokevirtual   #25  <Method int avz.ordinal()>
	//*  87  205:bipush          17
	//*  88  207:iastore         
	//*  89  208:getstatic       #18  <Field int[] a>
	//*  90  211:getstatic       #76  <Field avz avz.n>
	//*  91  214:invokevirtual   #25  <Method int avz.ordinal()>
	//*  92  217:bipush          18
	//*  93  219:iastore         
	//*  94  220:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   95  221:astore_0        
		try
		{
			a[avz.b.ordinal()] = 2;
		}
	//*  96  222:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   97  225:astore_0        
		try
		{
			a[avz.c.ordinal()] = 3;
		}
	//*  98  226:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   99  229:astore_0        
		try
		{
			a[avz.d.ordinal()] = 4;
		}
	//* 100  230:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//  101  233:astore_0        
		try
		{
			a[avz.e.ordinal()] = 5;
		}
	//* 102  234:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//  103  237:astore_0        
		try
		{
			a[avz.f.ordinal()] = 6;
		}
	//* 104  238:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//  105  241:astore_0        
		try
		{
			a[avz.g.ordinal()] = 7;
		}
	//* 106  242:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//  107  245:astore_0        
		try
		{
			a[avz.h.ordinal()] = 8;
		}
	//* 108  246:goto            88
		catch(NoSuchFieldError nosuchfielderror7) { }
	//  109  249:astore_0        
		try
		{
			a[avz.l.ordinal()] = 9;
		}
	//* 110  250:goto            100
		catch(NoSuchFieldError nosuchfielderror8) { }
	//  111  253:astore_0        
		try
		{
			a[avz.m.ordinal()] = 10;
		}
	//* 112  254:goto            112
		catch(NoSuchFieldError nosuchfielderror9) { }
	//  113  257:astore_0        
		try
		{
			a[avz.o.ordinal()] = 11;
		}
	//* 114  258:goto            124
		catch(NoSuchFieldError nosuchfielderror10) { }
	//  115  261:astore_0        
		try
		{
			a[avz.p.ordinal()] = 12;
		}
	//* 116  262:goto            136
		catch(NoSuchFieldError nosuchfielderror11) { }
	//  117  265:astore_0        
		try
		{
			a[avz.q.ordinal()] = 13;
		}
	//* 118  266:goto            148
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  119  269:astore_0        
		try
		{
			a[avz.r.ordinal()] = 14;
		}
	//* 120  270:goto            160
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  121  273:astore_0        
		try
		{
			a[avz.i.ordinal()] = 15;
		}
	//* 122  274:goto            172
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  123  277:astore_0        
		try
		{
			a[avz.j.ordinal()] = 16;
		}
	//* 124  278:goto            184
		catch(NoSuchFieldError nosuchfielderror15) { }
	//  125  281:astore_0        
		try
		{
			a[avz.k.ordinal()] = 17;
		}
	//* 126  282:goto            196
		catch(NoSuchFieldError nosuchfielderror16) { }
	//  127  285:astore_0        
		try
		{
			a[avz.n.ordinal()] = 18;
		}
	//* 128  286:goto            208
		catch(NoSuchFieldError nosuchfielderror17) { }
	//  129  289:astore_0        
	//* 130  290:return          
	}
}
