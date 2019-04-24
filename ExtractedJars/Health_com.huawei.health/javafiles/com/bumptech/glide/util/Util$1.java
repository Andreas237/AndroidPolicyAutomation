// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;


// Referenced classes of package com.bumptech.glide.util:
//			Util

static class Util$1
{

	static final int $SwitchMap$android$graphics$Bitmap$Config[];

	static 
	{
		$SwitchMap$android$graphics$Bitmap$Config = new int[android.graphics.Config.values().length];
	//    0    0:invokestatic    #18  <Method android.graphics.Bitmap$Config[] android.graphics.Bitmap$Config.values()>
	//    1    3:arraylength     
	//    2    4:newarray        int[]
	//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Config.ALPHA_8.ordinal()] = 1;
	//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//    5   12:getstatic       #24  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ALPHA_8>
	//    6   15:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//    7   18:iconst_1        
	//    8   19:iastore         
		}
	//*   9   20:goto            24
		catch(NoSuchFieldError nosuchfielderror) { }
	//   10   23:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Config.RGB_565.ordinal()] = 2;
	//   11   24:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//   12   27:getstatic       #31  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//   13   30:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//   14   33:iconst_2        
	//   15   34:iastore         
		}
	//*  16   35:goto            39
		catch(NoSuchFieldError nosuchfielderror1) { }
	//   17   38:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Config.ARGB_4444.ordinal()] = 3;
	//   18   39:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//   19   42:getstatic       #34  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
	//   20   45:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//   21   48:iconst_3        
	//   22   49:iastore         
		}
	//*  23   50:goto            54
		catch(NoSuchFieldError nosuchfielderror2) { }
	//   24   53:astore_0        
		try
		{
			$SwitchMap$android$graphics$Bitmap$Config[android.graphics.Config.ARGB_8888.ordinal()] = 4;
	//   25   54:getstatic       #20  <Field int[] $SwitchMap$android$graphics$Bitmap$Config>
	//   26   57:getstatic       #37  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   27   60:invokevirtual   #28  <Method int android.graphics.Bitmap$Config.ordinal()>
	//   28   63:iconst_4        
	//   29   64:iastore         
	//   30   65:return          
		}
		catch(NoSuchFieldError nosuchfielderror3) { }
	//   31   66:astore_0        
	//*  32   67:return          
	}
}
