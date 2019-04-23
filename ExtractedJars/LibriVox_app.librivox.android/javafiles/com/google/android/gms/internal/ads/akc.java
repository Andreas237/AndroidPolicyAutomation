// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			alq, aml, amn

final class akc
{

	static final int a[];
	static final int b[];
	static final int c[];

	static 
	{
		c = new int[alq.values().length];
	//    0    0:invokestatic    #18  <Method alq[] alq.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] c>
		try
		{
			c[alq.b.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] c>
	//    5   12:getstatic       #23  <Field alq alq.b>
	//    6   15:invokevirtual   #27  <Method int alq.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] c>
	//*  10   23:getstatic       #30  <Field alq alq.d>
	//*  11   26:invokevirtual   #27  <Method int alq.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] c>
	//*  15   34:getstatic       #32  <Field alq alq.c>
	//*  16   37:invokevirtual   #27  <Method int alq.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:invokestatic    #37  <Method aml[] aml.values()>
	//*  20   45:arraylength     
	//*  21   46:newarray        int[]
	//*  22   48:putstatic       #39  <Field int[] b>
	//*  23   51:getstatic       #39  <Field int[] b>
	//*  24   54:getstatic       #42  <Field aml aml.a>
	//*  25   57:invokevirtual   #43  <Method int aml.ordinal()>
	//*  26   60:iconst_1        
	//*  27   61:iastore         
	//*  28   62:getstatic       #39  <Field int[] b>
	//*  29   65:getstatic       #45  <Field aml aml.b>
	//*  30   68:invokevirtual   #43  <Method int aml.ordinal()>
	//*  31   71:iconst_2        
	//*  32   72:iastore         
	//*  33   73:getstatic       #39  <Field int[] b>
	//*  34   76:getstatic       #47  <Field aml aml.c>
	//*  35   79:invokevirtual   #43  <Method int aml.ordinal()>
	//*  36   82:iconst_3        
	//*  37   83:iastore         
	//*  38   84:invokestatic    #52  <Method amn[] amn.values()>
	//*  39   87:arraylength     
	//*  40   88:newarray        int[]
	//*  41   90:putstatic       #54  <Field int[] a>
	//*  42   93:getstatic       #54  <Field int[] a>
	//*  43   96:getstatic       #57  <Field amn amn.a>
	//*  44   99:invokevirtual   #58  <Method int amn.ordinal()>
	//*  45  102:iconst_1        
	//*  46  103:iastore         
	//*  47  104:getstatic       #54  <Field int[] a>
	//*  48  107:getstatic       #60  <Field amn amn.b>
	//*  49  110:invokevirtual   #58  <Method int amn.ordinal()>
	//*  50  113:iconst_2        
	//*  51  114:iastore         
	//*  52  115:getstatic       #54  <Field int[] a>
	//*  53  118:getstatic       #62  <Field amn amn.c>
	//*  54  121:invokevirtual   #58  <Method int amn.ordinal()>
	//*  55  124:iconst_3        
	//*  56  125:iastore         
	//*  57  126:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   58  127:astore_0        
		try
		{
			c[alq.d.ordinal()] = 2;
		}
	//*  59  128:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   60  131:astore_0        
		try
		{
			c[alq.c.ordinal()] = 3;
		}
	//*  61  132:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   62  135:astore_0        
		b = new int[aml.values().length];
		try
		{
			b[aml.a.ordinal()] = 1;
		}
	//*  63  136:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   64  139:astore_0        
		try
		{
			b[aml.b.ordinal()] = 2;
		}
	//*  65  140:goto            62
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   66  143:astore_0        
		try
		{
			b[aml.c.ordinal()] = 3;
		}
	//*  67  144:goto            73
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   68  147:astore_0        
		a = new int[amn.values().length];
		try
		{
			a[amn.a.ordinal()] = 1;
		}
	//*  69  148:goto            84
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   70  151:astore_0        
		try
		{
			a[amn.b.ordinal()] = 2;
		}
	//*  71  152:goto            104
		catch(NoSuchFieldError nosuchfielderror7) { }
	//   72  155:astore_0        
		try
		{
			a[amn.c.ordinal()] = 3;
		}
	//*  73  156:goto            115
		catch(NoSuchFieldError nosuchfielderror8) { }
	//   74  159:astore_0        
	//*  75  160:return          
	}
}
