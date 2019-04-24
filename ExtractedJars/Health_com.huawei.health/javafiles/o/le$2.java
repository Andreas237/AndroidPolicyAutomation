// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			le

static class le$2
{

	static final int a[];
	static final int c[];
	static final int e[];

	static 
	{
		e = new int[lm$d.values().length];
	//    0    0:invokestatic    #20  <Method lm$d[] lm$d.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #22  <Field int[] e>
		try
		{
			e[lm$d.b.ordinal()] = 1;
	//    4    9:getstatic       #22  <Field int[] e>
	//    5   12:getstatic       #26  <Field lm$d lm$d.b>
	//    6   15:invokevirtual   #30  <Method int lm$d.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			e[lm$d.c.ordinal()] = 2;
	//   11   24:getstatic       #22  <Field int[] e>
	//   12   27:getstatic       #32  <Field lm$d lm$d.c>
	//   13   30:invokevirtual   #30  <Method int lm$d.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		c = new int[lm$a.values().length];
	//   18   39:invokestatic    #37  <Method lm$a[] lm$a.values()>
	//   19   42:arraylength     
	//   20   43:newarray        int[]
	//   21   45:putstatic       #39  <Field int[] c>
		try
		{
			c[lm$a.d.ordinal()] = 1;
	//   22   48:getstatic       #39  <Field int[] c>
	//   23   51:getstatic       #43  <Field lm$a lm$a.d>
	//   24   54:invokevirtual   #44  <Method int lm$a.ordinal()>
	//   25   57:iconst_1        
	//   26   58:iastore         
		}
	//*  27   59:goto            63
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   28   62:astore_0        
		try
		{
			c[lm$a.a.ordinal()] = 2;
	//   29   63:getstatic       #39  <Field int[] c>
	//   30   66:getstatic       #46  <Field lm$a lm$a.a>
	//   31   69:invokevirtual   #44  <Method int lm$a.ordinal()>
	//   32   72:iconst_2        
	//   33   73:iastore         
		}
	//*  34   74:goto            78
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   35   77:astore_0        
		try
		{
			c[lm$a.c.ordinal()] = 3;
	//   36   78:getstatic       #39  <Field int[] c>
	//   37   81:getstatic       #48  <Field lm$a lm$a.c>
	//   38   84:invokevirtual   #44  <Method int lm$a.ordinal()>
	//   39   87:iconst_3        
	//   40   88:iastore         
		}
	//*  41   89:goto            93
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   42   92:astore_0        
		a = new int[lm$k.values().length];
	//   43   93:invokestatic    #53  <Method lm$k[] lm$k.values()>
	//   44   96:arraylength     
	//   45   97:newarray        int[]
	//   46   99:putstatic       #55  <Field int[] a>
		try
		{
			a[lm$k.c.ordinal()] = 1;
	//   47  102:getstatic       #55  <Field int[] a>
	//   48  105:getstatic       #58  <Field lm$k lm$k.c>
	//   49  108:invokevirtual   #59  <Method int lm$k.ordinal()>
	//   50  111:iconst_1        
	//   51  112:iastore         
		}
	//*  52  113:goto            117
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   53  116:astore_0        
		try
		{
			a[lm$k.d.ordinal()] = 2;
	//   54  117:getstatic       #55  <Field int[] a>
	//   55  120:getstatic       #61  <Field lm$k lm$k.d>
	//   56  123:invokevirtual   #59  <Method int lm$k.ordinal()>
	//   57  126:iconst_2        
	//   58  127:iastore         
	//   59  128:return          
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   60  129:astore_0        
	//*  61  130:return          
	}
}
