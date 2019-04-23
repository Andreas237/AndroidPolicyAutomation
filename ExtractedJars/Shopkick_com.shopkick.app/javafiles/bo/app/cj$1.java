// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;


// Referenced classes of package bo.app:
//			cj, v

static class cj$1
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
			a[v.a.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #23  <Field v v.a>
	//    6   15:invokevirtual   #27  <Method int v.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] a>
	//*  10   23:getstatic       #30  <Field v v.b>
	//*  11   26:invokevirtual   #27  <Method int v.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   15   32:astore_0        
		try
		{
			a[v.b.ordinal()] = 2;
		}
	//*  16   33:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   36:astore_0        
	//*  18   37:return          
	}
}
