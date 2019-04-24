// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			nm

static class nm$2
{

	static final int e[];

	static 
	{
		e = new int[ly$c.values().length];
	//    0    0:invokestatic    #18  <Method ly$c[] ly$c.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] e>
		try
		{
			e[ly$c.b.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] e>
	//    5   12:getstatic       #24  <Field ly$c ly$c.b>
	//    6   15:invokevirtual   #28  <Method int ly$c.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			e[ly$c.c.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] e>
	//   12   27:getstatic       #31  <Field ly$c ly$c.c>
	//   13   30:invokevirtual   #28  <Method int ly$c.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			e[ly$c.a.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] e>
	//   19   42:getstatic       #34  <Field ly$c ly$c.a>
	//   20   45:invokevirtual   #28  <Method int ly$c.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			e[ly$c.d.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] e>
	//   26   57:getstatic       #37  <Field ly$c ly$c.d>
	//   27   60:invokevirtual   #28  <Method int ly$c.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
	//   30   65:return          
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
