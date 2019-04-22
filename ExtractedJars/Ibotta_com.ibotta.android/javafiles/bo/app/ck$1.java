// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			ck, v

static class ck$1
{

	static final int a[];

	static 
	{
		a = new int[v.values().length];
	//    0    0:invokestatic    #18  <Method v[] v.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[v.f.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field v v.f>
	//    6   15:invokevirtual   #28  <Method int v.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #31  <Field v v.b>
	//*  11   26:invokevirtual   #28  <Method int v.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] a>
	//*  15   34:getstatic       #33  <Field v v.a>
	//*  16   37:invokevirtual   #28  <Method int v.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] a>
	//*  20   45:getstatic       #36  <Field v v.d>
	//*  21   48:invokevirtual   #28  <Method int v.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:getstatic       #20  <Field int[] a>
	//*  25   56:getstatic       #39  <Field v v.e>
	//*  26   59:invokevirtual   #28  <Method int v.ordinal()>
	//*  27   62:iconst_5        
	//*  28   63:iastore         
	//*  29   64:getstatic       #20  <Field int[] a>
	//*  30   67:getstatic       #42  <Field v v.c>
	//*  31   70:invokevirtual   #28  <Method int v.ordinal()>
	//*  32   73:bipush          6
	//*  33   75:iastore         
	//*  34   76:getstatic       #20  <Field int[] a>
	//*  35   79:getstatic       #45  <Field v v.g>
	//*  36   82:invokevirtual   #28  <Method int v.ordinal()>
	//*  37   85:bipush          7
	//*  38   87:iastore         
	//*  39   88:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   40   89:astore_0        
		try
		{
			a[v.b.ordinal()] = 2;
		}
	//*  41   90:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   42   93:astore_0        
		try
		{
			a[v.a.ordinal()] = 3;
		}
	//*  43   94:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   44   97:astore_0        
		try
		{
			a[v.d.ordinal()] = 4;
		}
	//*  45   98:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   46  101:astore_0        
		try
		{
			a[v.e.ordinal()] = 5;
		}
	//*  47  102:goto            53
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   48  105:astore_0        
		try
		{
			a[v.c.ordinal()] = 6;
		}
	//*  49  106:goto            64
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   50  109:astore_0        
		try
		{
			a[v.g.ordinal()] = 7;
		}
	//*  51  110:goto            76
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   52  113:astore_0        
	//*  53  114:return          
	}
}
