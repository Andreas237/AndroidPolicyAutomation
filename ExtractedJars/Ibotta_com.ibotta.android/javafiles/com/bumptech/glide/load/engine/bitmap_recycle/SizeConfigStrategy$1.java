// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			SizeConfigStrategy

static class SizeConfigStrategy$1
{

	static final int $SwitchMap$android$graphics$Bitmap$Config[];

	static 
	{
		$SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Bitmap.Config.values().length];
	//    0    0:invokestatic    #18  <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//    5   12:getstatic       #24  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    6   15:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//*  10   23:getstatic       #31  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*  11   26:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//*  12   29:iconst_2        
	//*  13   30:iastore         
	//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//*  15   34:getstatic       #34  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//*  16   37:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//*  17   40:iconst_3        
	//*  18   41:iastore         
	//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//*  20   45:getstatic       #37  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//*  21   48:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//*  22   51:iconst_4        
	//*  23   52:iastore         
	//*  24   53:return          
		catch(NoSuchFieldError nosuchfielderror) { }
	//   25   54:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
		}
	//*  26   55:goto            20
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   27   58:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
		}
	//*  28   59:goto            31
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   29   62:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
		}
	//*  30   63:goto            42
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
