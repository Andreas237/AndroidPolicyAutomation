// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lm

static class lm$4
{

	static final int a[];
	static final int e[];

	static 
	{
		a = new int[lm$d.values().length];
	//    0    0:invokestatic    #19  <Method lm$d[] lm$d.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #21  <Field int[] a>
		try
		{
			a[lm$d.b.ordinal()] = 1;
	//    4    9:getstatic       #21  <Field int[] a>
	//    5   12:getstatic       #25  <Field lm$d lm$d.b>
	//    6   15:invokevirtual   #29  <Method int lm$d.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			a[lm$d.c.ordinal()] = 2;
	//   11   24:getstatic       #21  <Field int[] a>
	//   12   27:getstatic       #32  <Field lm$d lm$d.c>
	//   13   30:invokevirtual   #29  <Method int lm$d.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		e = new int[lm$e.values().length];
	//   18   39:invokestatic    #37  <Method lm$e[] lm$e.values()>
	//   19   42:arraylength     
	//   20   43:newarray        int[]
	//   21   45:putstatic       #39  <Field int[] e>
		try
		{
			e[lm$e.c.ordinal()] = 1;
	//   22   48:getstatic       #39  <Field int[] e>
	//   23   51:getstatic       #42  <Field lm$e lm$e.c>
	//   24   54:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   25   57:iconst_1        
	//   26   58:iastore         
		}
	//*  27   59:goto            63
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   28   62:astore_0        
		try
		{
			e[lm$e.k.ordinal()] = 2;
	//   29   63:getstatic       #39  <Field int[] e>
	//   30   66:getstatic       #46  <Field lm$e lm$e.k>
	//   31   69:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   32   72:iconst_2        
	//   33   73:iastore         
		}
	//*  34   74:goto            78
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   35   77:astore_0        
		try
		{
			e[lm$e.d.ordinal()] = 3;
	//   36   78:getstatic       #39  <Field int[] e>
	//   37   81:getstatic       #49  <Field lm$e lm$e.d>
	//   38   84:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   39   87:iconst_3        
	//   40   88:iastore         
		}
	//*  41   89:goto            93
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   92:astore_0        
		try
		{
			e[lm$e.b.ordinal()] = 4;
	//   43   93:getstatic       #39  <Field int[] e>
	//   44   96:getstatic       #51  <Field lm$e lm$e.b>
	//   45   99:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   46  102:iconst_4        
	//   47  103:iastore         
		}
	//*  48  104:goto            108
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   49  107:astore_0        
		try
		{
			e[lm$e.a.ordinal()] = 5;
	//   50  108:getstatic       #39  <Field int[] e>
	//   51  111:getstatic       #53  <Field lm$e lm$e.a>
	//   52  114:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   53  117:iconst_5        
	//   54  118:iastore         
		}
	//*  55  119:goto            123
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  122:astore_0        
		try
		{
			e[lm$e.e.ordinal()] = 6;
	//   57  123:getstatic       #39  <Field int[] e>
	//   58  126:getstatic       #55  <Field lm$e lm$e.e>
	//   59  129:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   60  132:bipush          6
	//   61  134:iastore         
		}
	//*  62  135:goto            139
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  138:astore_0        
		try
		{
			e[lm$e.f.ordinal()] = 7;
	//   64  139:getstatic       #39  <Field int[] e>
	//   65  142:getstatic       #58  <Field lm$e lm$e.f>
	//   66  145:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   67  148:bipush          7
	//   68  150:iastore         
		}
	//*  69  151:goto            155
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   70  154:astore_0        
		try
		{
			e[lm$e.o.ordinal()] = 8;
	//   71  155:getstatic       #39  <Field int[] e>
	//   72  158:getstatic       #61  <Field lm$e lm$e.o>
	//   73  161:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   74  164:bipush          8
	//   75  166:iastore         
		}
	//*  76  167:goto            171
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   77  170:astore_0        
		try
		{
			e[lm$e.p.ordinal()] = 9;
	//   78  171:getstatic       #39  <Field int[] e>
	//   79  174:getstatic       #64  <Field lm$e lm$e.p>
	//   80  177:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   81  180:bipush          9
	//   82  182:iastore         
		}
	//*  83  183:goto            187
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   84  186:astore_0        
		try
		{
			e[lm$e.h.ordinal()] = 10;
	//   85  187:getstatic       #39  <Field int[] e>
	//   86  190:getstatic       #67  <Field lm$e lm$e.h>
	//   87  193:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   88  196:bipush          10
	//   89  198:iastore         
		}
	//*  90  199:goto            203
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   91  202:astore_0        
		try
		{
			e[lm$e.i.ordinal()] = 11;
	//   92  203:getstatic       #39  <Field int[] e>
	//   93  206:getstatic       #70  <Field lm$e lm$e.i>
	//   94  209:invokevirtual   #43  <Method int lm$e.ordinal()>
	//   95  212:bipush          11
	//   96  214:iastore         
		}
	//*  97  215:goto            219
		catch(NoSuchFieldError nosuchfielderror12) { }
	//   98  218:astore_0        
		try
		{
			e[lm$e.g.ordinal()] = 12;
	//   99  219:getstatic       #39  <Field int[] e>
	//  100  222:getstatic       #73  <Field lm$e lm$e.g>
	//  101  225:invokevirtual   #43  <Method int lm$e.ordinal()>
	//  102  228:bipush          12
	//  103  230:iastore         
		}
	//* 104  231:goto            235
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  105  234:astore_0        
		try
		{
			e[lm$e.m.ordinal()] = 13;
	//  106  235:getstatic       #39  <Field int[] e>
	//  107  238:getstatic       #76  <Field lm$e lm$e.m>
	//  108  241:invokevirtual   #43  <Method int lm$e.ordinal()>
	//  109  244:bipush          13
	//  110  246:iastore         
	//  111  247:return          
		}
		catch(NoSuchFieldError nosuchfielderror14) { }
	//  112  248:astore_0        
	//* 113  249:return          
	}
}
