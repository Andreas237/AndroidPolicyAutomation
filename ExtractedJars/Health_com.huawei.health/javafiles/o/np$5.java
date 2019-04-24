// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			np

static class np$5
{

	static final int a[];
	static final int b[];
	static final int c[];
	static final int e[];

	static 
	{
		b = new int[lm$c.values().length];
	//    0    0:invokestatic    #21  <Method lm$c[] lm$c.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #23  <Field int[] b>
		try
		{
			b[lm$c.c.ordinal()] = 1;
	//    4    9:getstatic       #23  <Field int[] b>
	//    5   12:getstatic       #26  <Field lm$c lm$c.c>
	//    6   15:invokevirtual   #30  <Method int lm$c.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			b[lm$c.b.ordinal()] = 2;
	//   11   24:getstatic       #23  <Field int[] b>
	//   12   27:getstatic       #32  <Field lm$c lm$c.b>
	//   13   30:invokevirtual   #30  <Method int lm$c.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			b[lm$c.e.ordinal()] = 3;
	//   18   39:getstatic       #23  <Field int[] b>
	//   19   42:getstatic       #34  <Field lm$c lm$c.e>
	//   20   45:invokevirtual   #30  <Method int lm$c.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			b[lm$c.a.ordinal()] = 4;
	//   25   54:getstatic       #23  <Field int[] b>
	//   26   57:getstatic       #36  <Field lm$c lm$c.a>
	//   27   60:invokevirtual   #30  <Method int lm$c.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		try
		{
			b[lm$c.d.ordinal()] = 5;
	//   32   69:getstatic       #23  <Field int[] b>
	//   33   72:getstatic       #39  <Field lm$c lm$c.d>
	//   34   75:invokevirtual   #30  <Method int lm$c.ordinal()>
	//   35   78:iconst_5        
	//   36   79:iastore         
		}
	//*  37   80:goto            84
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   83:astore_0        
		try
		{
			b[lm$c.h.ordinal()] = 6;
	//   39   84:getstatic       #23  <Field int[] b>
	//   40   87:getstatic       #42  <Field lm$c lm$c.h>
	//   41   90:invokevirtual   #30  <Method int lm$c.ordinal()>
	//   42   93:bipush          6
	//   43   95:iastore         
		}
	//*  44   96:goto            100
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   99:astore_0        
		c = new int[lm$d.values().length];
	//   46  100:invokestatic    #47  <Method lm$d[] lm$d.values()>
	//   47  103:arraylength     
	//   48  104:newarray        int[]
	//   49  106:putstatic       #49  <Field int[] c>
		try
		{
			c[lm$d.c.ordinal()] = 1;
	//   50  109:getstatic       #49  <Field int[] c>
	//   51  112:getstatic       #52  <Field lm$d lm$d.c>
	//   52  115:invokevirtual   #53  <Method int lm$d.ordinal()>
	//   53  118:iconst_1        
	//   54  119:iastore         
		}
	//*  55  120:goto            124
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   56  123:astore_0        
		try
		{
			c[lm$d.b.ordinal()] = 2;
	//   57  124:getstatic       #49  <Field int[] c>
	//   58  127:getstatic       #55  <Field lm$d lm$d.b>
	//   59  130:invokevirtual   #53  <Method int lm$d.ordinal()>
	//   60  133:iconst_2        
	//   61  134:iastore         
		}
	//*  62  135:goto            139
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   63  138:astore_0        
		a = new int[lm$k.values().length];
	//   64  139:invokestatic    #60  <Method lm$k[] lm$k.values()>
	//   65  142:arraylength     
	//   66  143:newarray        int[]
	//   67  145:putstatic       #62  <Field int[] a>
		try
		{
			a[lm$k.c.ordinal()] = 1;
	//   68  148:getstatic       #62  <Field int[] a>
	//   69  151:getstatic       #65  <Field lm$k lm$k.c>
	//   70  154:invokevirtual   #66  <Method int lm$k.ordinal()>
	//   71  157:iconst_1        
	//   72  158:iastore         
		}
	//*  73  159:goto            163
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   74  162:astore_0        
		try
		{
			a[lm$k.d.ordinal()] = 2;
	//   75  163:getstatic       #62  <Field int[] a>
	//   76  166:getstatic       #68  <Field lm$k lm$k.d>
	//   77  169:invokevirtual   #66  <Method int lm$k.ordinal()>
	//   78  172:iconst_2        
	//   79  173:iastore         
		}
	//*  80  174:goto            178
		catch(NoSuchFieldError nosuchfielderror9) { }
	//   81  177:astore_0        
		try
		{
			a[lm$k.b.ordinal()] = 3;
	//   82  178:getstatic       #62  <Field int[] a>
	//   83  181:getstatic       #70  <Field lm$k lm$k.b>
	//   84  184:invokevirtual   #66  <Method int lm$k.ordinal()>
	//   85  187:iconst_3        
	//   86  188:iastore         
		}
	//*  87  189:goto            193
		catch(NoSuchFieldError nosuchfielderror10) { }
	//   88  192:astore_0        
		e = new int[lm$a.values().length];
	//   89  193:invokestatic    #75  <Method lm$a[] lm$a.values()>
	//   90  196:arraylength     
	//   91  197:newarray        int[]
	//   92  199:putstatic       #77  <Field int[] e>
		try
		{
			e[lm$a.d.ordinal()] = 1;
	//   93  202:getstatic       #77  <Field int[] e>
	//   94  205:getstatic       #80  <Field lm$a lm$a.d>
	//   95  208:invokevirtual   #81  <Method int lm$a.ordinal()>
	//   96  211:iconst_1        
	//   97  212:iastore         
		}
	//*  98  213:goto            217
		catch(NoSuchFieldError nosuchfielderror11) { }
	//   99  216:astore_0        
		try
		{
			e[lm$a.a.ordinal()] = 2;
	//  100  217:getstatic       #77  <Field int[] e>
	//  101  220:getstatic       #83  <Field lm$a lm$a.a>
	//  102  223:invokevirtual   #81  <Method int lm$a.ordinal()>
	//  103  226:iconst_2        
	//  104  227:iastore         
		}
	//* 105  228:goto            232
		catch(NoSuchFieldError nosuchfielderror12) { }
	//  106  231:astore_0        
		try
		{
			e[lm$a.c.ordinal()] = 3;
	//  107  232:getstatic       #77  <Field int[] e>
	//  108  235:getstatic       #85  <Field lm$a lm$a.c>
	//  109  238:invokevirtual   #81  <Method int lm$a.ordinal()>
	//  110  241:iconst_3        
	//  111  242:iastore         
	//  112  243:return          
		}
		catch(NoSuchFieldError nosuchfielderror13) { }
	//  113  244:astore_0        
	//* 114  245:return          
	}
}
