// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;


// Referenced classes of package com.amap.api.maps:
//			CoordinateConverter

static class CoordinateConverter$1
{

	static final int a[];

	static 
	{
		a = new int[ordType.values().length];
	//    0    0:invokestatic    #18  <Method CoordinateConverter$CoordType[] CoordinateConverter$CoordType.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] a>
		try
		{
			a[ordType.BAIDU.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] a>
	//    5   12:getstatic       #24  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.BAIDU>
	//    6   15:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			a[ordType.MAPBAR.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] a>
	//   12   27:getstatic       #31  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.MAPBAR>
	//   13   30:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			a[ordType.MAPABC.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] a>
	//   19   42:getstatic       #34  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.MAPABC>
	//   20   45:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			a[ordType.SOSOMAP.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] a>
	//   26   57:getstatic       #37  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.SOSOMAP>
	//   27   60:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
		}
	//*  30   65:goto            69
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   68:astore_0        
		try
		{
			a[ordType.ALIYUN.ordinal()] = 5;
	//   32   69:getstatic       #20  <Field int[] a>
	//   33   72:getstatic       #40  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.ALIYUN>
	//   34   75:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   35   78:iconst_5        
	//   36   79:iastore         
		}
	//*  37   80:goto            84
		catch(NoSuchFieldError nosuchfielderror4) { }
	//   38   83:astore_0        
		try
		{
			a[ordType.GOOGLE.ordinal()] = 6;
	//   39   84:getstatic       #20  <Field int[] a>
	//   40   87:getstatic       #43  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.GOOGLE>
	//   41   90:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   42   93:bipush          6
	//   43   95:iastore         
		}
	//*  44   96:goto            100
		catch(NoSuchFieldError nosuchfielderror5) { }
	//   45   99:astore_0        
		try
		{
			a[ordType.GPS.ordinal()] = 7;
	//   46  100:getstatic       #20  <Field int[] a>
	//   47  103:getstatic       #46  <Field CoordinateConverter$CoordType CoordinateConverter$CoordType.GPS>
	//   48  106:invokevirtual   #28  <Method int CoordinateConverter$CoordType.ordinal()>
	//   49  109:bipush          7
	//   50  111:iastore         
	//   51  112:return          
		}
		catch(NoSuchFieldError nosuchfielderror6) { }
	//   52  113:astore_0        
	//*  53  114:return          
	}
}
