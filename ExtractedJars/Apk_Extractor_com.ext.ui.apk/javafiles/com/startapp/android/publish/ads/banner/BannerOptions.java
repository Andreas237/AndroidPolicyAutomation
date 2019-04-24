// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner;

import java.io.Serializable;

public class BannerOptions
	implements Serializable
{
	public static final class Effect extends Enum
	{

		public static Effect getByIndex(int i1)
		{
			Effect effect1 = ROTATE_3D;
		//    0    0:getstatic       #25  <Field BannerOptions$Effect ROTATE_3D>
		//    1    3:astore_2        
			Effect aeffect[] = values();
		//    2    4:invokestatic    #47  <Method BannerOptions$Effect[] values()>
		//    3    7:astore_3        
			for(int j1 = 0; j1 < aeffect.length; j1++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          37
				if(aeffect[j1].getIndex() == i1)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #51  <Method int getIndex()>
		//*  14   22:iload_0         
		//*  15   23:icmpne          30
					effect1 = aeffect[j1];
		//   16   26:aload_3         
		//   17   27:iload_1         
		//   18   28:aaload          
		//   19   29:astore_2        

		//   20   30:iload_1         
		//   21   31:iconst_1        
		//   22   32:iadd            
		//   23   33:istore_1        
		//*  24   34:goto            10
			return effect1;
		//   25   37:aload_2         
		//   26   38:areturn         
		}

		public static Effect getByName(String s)
		{
			Effect effect1 = ROTATE_3D;
		//    0    0:getstatic       #25  <Field BannerOptions$Effect ROTATE_3D>
		//    1    3:astore_2        
			Effect aeffect[] = values();
		//    2    4:invokestatic    #47  <Method BannerOptions$Effect[] values()>
		//    3    7:astore_3        
			for(int i1 = 0; i1 < aeffect.length; i1++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(aeffect[i1].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #57  <Method String name()>
		//*  14   22:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #66  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					effect1 = aeffect[i1];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return effect1;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static Effect valueOf(String s)
		{
			return (Effect)Enum.valueOf(com/startapp/android/publish/ads/banner/BannerOptions$Effect, s);
		//    0    0:ldc1            #2   <Class BannerOptions$Effect>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class BannerOptions$Effect>
		//    4    9:areturn         
		}

		public static Effect[] values()
		{
			return (Effect[])((Effect []) ($VALUES)).clone();
		//    0    0:getstatic       #33  <Field BannerOptions$Effect[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.startapp.android.publish.ads.banner.BannerOptions$Effect_3B_.clone()>
		//    2    6:checkcast       #71  <Class BannerOptions$Effect[]>
		//    3    9:areturn         
		}

		public int getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int index>
		//    2    4:ireturn         
		}

		public int getRotationMultiplier()
		{
			return (int)Math.pow(2D, index - 1);
		//    0    0:ldc2w           #77  <Double 2D>
		//    1    3:aload_0         
		//    2    4:getfield        #39  <Field int index>
		//    3    7:iconst_1        
		//    4    8:isub            
		//    5    9:i2d             
		//    6   10:invokestatic    #84  <Method double Math.pow(double, double)>
		//    7   13:d2i             
		//    8   14:ireturn         
		}

		private static final Effect $VALUES[];
		public static final Effect EXCHANGE;
		public static final Effect FLY_IN;
		public static final Effect ROTATE_3D;
		private int index;

		static 
		{
			ROTATE_3D = new Effect("ROTATE_3D", 0, 1);
		//    0    0:new             #2   <Class BannerOptions$Effect>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "ROTATE_3D">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #23  <Method void BannerOptions$Effect(String, int, int)>
		//    6   11:putstatic       #25  <Field BannerOptions$Effect ROTATE_3D>
			EXCHANGE = new Effect("EXCHANGE", 1, 2);
		//    7   14:new             #2   <Class BannerOptions$Effect>
		//    8   17:dup             
		//    9   18:ldc1            #26  <String "EXCHANGE">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #23  <Method void BannerOptions$Effect(String, int, int)>
		//   13   25:putstatic       #28  <Field BannerOptions$Effect EXCHANGE>
			FLY_IN = new Effect("FLY_IN", 2, 3);
		//   14   28:new             #2   <Class BannerOptions$Effect>
		//   15   31:dup             
		//   16   32:ldc1            #29  <String "FLY_IN">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #23  <Method void BannerOptions$Effect(String, int, int)>
		//   20   39:putstatic       #31  <Field BannerOptions$Effect FLY_IN>
			$VALUES = (new Effect[] {
				ROTATE_3D, EXCHANGE, FLY_IN
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       Effect[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #25  <Field BannerOptions$Effect ROTATE_3D>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #28  <Field BannerOptions$Effect EXCHANGE>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #31  <Field BannerOptions$Effect FLY_IN>
		//   34   63:aastore         
		//   35   64:putstatic       #33  <Field BannerOptions$Effect[] $VALUES>
		//*  36   67:return          
		}

		private Effect(String s, int i1, int j1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
			index = j1;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #39  <Field int index>
		//    7   11:return          
		}
	}


	public BannerOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		width = 300;
	//    2    4:aload_0         
	//    3    5:sipush          300
	//    4    8:putfield        #42  <Field int width>
		height = 50;
	//    5   11:aload_0         
	//    6   12:bipush          50
	//    7   14:putfield        #44  <Field int height>
		minViewabilityPercentage = 50;
	//    8   17:aload_0         
	//    9   18:bipush          50
	//   10   20:putfield        #46  <Field int minViewabilityPercentage>
		timeBetweenFrames = 25;
	//   11   23:aload_0         
	//   12   24:bipush          25
	//   13   26:putfield        #48  <Field int timeBetweenFrames>
		stepSize = 5;
	//   14   29:aload_0         
	//   15   30:iconst_5        
	//   16   31:putfield        #50  <Field int stepSize>
		delayFaceTime = 5000;
	//   17   34:aload_0         
	//   18   35:sipush          5000
	//   19   38:putfield        #52  <Field int delayFaceTime>
		adsNumber = 4;
	//   20   41:aload_0         
	//   21   42:iconst_4        
	//   22   43:putfield        #54  <Field int adsNumber>
		htmlAdsNumber = 10;
	//   23   46:aload_0         
	//   24   47:bipush          10
	//   25   49:putfield        #56  <Field int htmlAdsNumber>
		refreshRate3D = 60000;
	//   26   52:aload_0         
	//   27   53:ldc1            #57  <Int 60000>
	//   28   55:putfield        #59  <Field int refreshRate3D>
		widthRatio = 1.0F;
	//   29   58:aload_0         
	//   30   59:fconst_1        
	//   31   60:putfield        #61  <Field float widthRatio>
		heightRatio = 1.0F;
	//   32   63:aload_0         
	//   33   64:fconst_1        
	//   34   65:putfield        #63  <Field float heightRatio>
		minScale = 0.88F;
	//   35   68:aload_0         
	//   36   69:ldc1            #64  <Float 0.88F>
	//   37   71:putfield        #66  <Field float minScale>
		scalePower = 4;
	//   38   74:aload_0         
	//   39   75:iconst_4        
	//   40   76:putfield        #68  <Field int scalePower>
		effect = Effect.ROTATE_3D;
	//   41   79:aload_0         
	//   42   80:getstatic       #71  <Field BannerOptions$Effect BannerOptions$Effect.ROTATE_3D>
	//   43   83:putfield        #73  <Field BannerOptions$Effect effect>
		rotateThroughOnStart = true;
	//   44   86:aload_0         
	//   45   87:iconst_1        
	//   46   88:putfield        #75  <Field boolean rotateThroughOnStart>
		rotateThroughSpeedMult = 2;
	//   47   91:aload_0         
	//   48   92:iconst_2        
	//   49   93:putfield        #77  <Field int rotateThroughSpeedMult>
		refreshRate = 60000;
	//   50   96:aload_0         
	//   51   97:ldc1            #57  <Int 60000>
	//   52   99:putfield        #79  <Field int refreshRate>
	//   53  102:return          
	}

	public BannerOptions(BannerOptions banneroptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		width = 300;
	//    2    4:aload_0         
	//    3    5:sipush          300
	//    4    8:putfield        #42  <Field int width>
		height = 50;
	//    5   11:aload_0         
	//    6   12:bipush          50
	//    7   14:putfield        #44  <Field int height>
		minViewabilityPercentage = 50;
	//    8   17:aload_0         
	//    9   18:bipush          50
	//   10   20:putfield        #46  <Field int minViewabilityPercentage>
		timeBetweenFrames = 25;
	//   11   23:aload_0         
	//   12   24:bipush          25
	//   13   26:putfield        #48  <Field int timeBetweenFrames>
		stepSize = 5;
	//   14   29:aload_0         
	//   15   30:iconst_5        
	//   16   31:putfield        #50  <Field int stepSize>
		delayFaceTime = 5000;
	//   17   34:aload_0         
	//   18   35:sipush          5000
	//   19   38:putfield        #52  <Field int delayFaceTime>
		adsNumber = 4;
	//   20   41:aload_0         
	//   21   42:iconst_4        
	//   22   43:putfield        #54  <Field int adsNumber>
		htmlAdsNumber = 10;
	//   23   46:aload_0         
	//   24   47:bipush          10
	//   25   49:putfield        #56  <Field int htmlAdsNumber>
		refreshRate3D = 60000;
	//   26   52:aload_0         
	//   27   53:ldc1            #57  <Int 60000>
	//   28   55:putfield        #59  <Field int refreshRate3D>
		widthRatio = 1.0F;
	//   29   58:aload_0         
	//   30   59:fconst_1        
	//   31   60:putfield        #61  <Field float widthRatio>
		heightRatio = 1.0F;
	//   32   63:aload_0         
	//   33   64:fconst_1        
	//   34   65:putfield        #63  <Field float heightRatio>
		minScale = 0.88F;
	//   35   68:aload_0         
	//   36   69:ldc1            #64  <Float 0.88F>
	//   37   71:putfield        #66  <Field float minScale>
		scalePower = 4;
	//   38   74:aload_0         
	//   39   75:iconst_4        
	//   40   76:putfield        #68  <Field int scalePower>
		effect = Effect.ROTATE_3D;
	//   41   79:aload_0         
	//   42   80:getstatic       #71  <Field BannerOptions$Effect BannerOptions$Effect.ROTATE_3D>
	//   43   83:putfield        #73  <Field BannerOptions$Effect effect>
		rotateThroughOnStart = true;
	//   44   86:aload_0         
	//   45   87:iconst_1        
	//   46   88:putfield        #75  <Field boolean rotateThroughOnStart>
		rotateThroughSpeedMult = 2;
	//   47   91:aload_0         
	//   48   92:iconst_2        
	//   49   93:putfield        #77  <Field int rotateThroughSpeedMult>
		refreshRate = 60000;
	//   50   96:aload_0         
	//   51   97:ldc1            #57  <Int 60000>
	//   52   99:putfield        #79  <Field int refreshRate>
		width = banneroptions.width;
	//   53  102:aload_0         
	//   54  103:aload_1         
	//   55  104:getfield        #42  <Field int width>
	//   56  107:putfield        #42  <Field int width>
		height = banneroptions.height;
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:getfield        #44  <Field int height>
	//   60  115:putfield        #44  <Field int height>
		timeBetweenFrames = banneroptions.timeBetweenFrames;
	//   61  118:aload_0         
	//   62  119:aload_1         
	//   63  120:getfield        #48  <Field int timeBetweenFrames>
	//   64  123:putfield        #48  <Field int timeBetweenFrames>
		stepSize = banneroptions.stepSize;
	//   65  126:aload_0         
	//   66  127:aload_1         
	//   67  128:getfield        #50  <Field int stepSize>
	//   68  131:putfield        #50  <Field int stepSize>
		delayFaceTime = banneroptions.delayFaceTime;
	//   69  134:aload_0         
	//   70  135:aload_1         
	//   71  136:getfield        #52  <Field int delayFaceTime>
	//   72  139:putfield        #52  <Field int delayFaceTime>
		adsNumber = banneroptions.adsNumber;
	//   73  142:aload_0         
	//   74  143:aload_1         
	//   75  144:getfield        #54  <Field int adsNumber>
	//   76  147:putfield        #54  <Field int adsNumber>
		htmlAdsNumber = banneroptions.htmlAdsNumber;
	//   77  150:aload_0         
	//   78  151:aload_1         
	//   79  152:getfield        #56  <Field int htmlAdsNumber>
	//   80  155:putfield        #56  <Field int htmlAdsNumber>
		refreshRate3D = banneroptions.refreshRate3D;
	//   81  158:aload_0         
	//   82  159:aload_1         
	//   83  160:getfield        #59  <Field int refreshRate3D>
	//   84  163:putfield        #59  <Field int refreshRate3D>
		widthRatio = banneroptions.widthRatio;
	//   85  166:aload_0         
	//   86  167:aload_1         
	//   87  168:getfield        #61  <Field float widthRatio>
	//   88  171:putfield        #61  <Field float widthRatio>
		heightRatio = banneroptions.heightRatio;
	//   89  174:aload_0         
	//   90  175:aload_1         
	//   91  176:getfield        #63  <Field float heightRatio>
	//   92  179:putfield        #63  <Field float heightRatio>
		minScale = banneroptions.minScale;
	//   93  182:aload_0         
	//   94  183:aload_1         
	//   95  184:getfield        #66  <Field float minScale>
	//   96  187:putfield        #66  <Field float minScale>
		scalePower = banneroptions.scalePower;
	//   97  190:aload_0         
	//   98  191:aload_1         
	//   99  192:getfield        #68  <Field int scalePower>
	//  100  195:putfield        #68  <Field int scalePower>
		effect = banneroptions.effect;
	//  101  198:aload_0         
	//  102  199:aload_1         
	//  103  200:getfield        #73  <Field BannerOptions$Effect effect>
	//  104  203:putfield        #73  <Field BannerOptions$Effect effect>
		rotateThroughOnStart = banneroptions.rotateThroughOnStart;
	//  105  206:aload_0         
	//  106  207:aload_1         
	//  107  208:getfield        #75  <Field boolean rotateThroughOnStart>
	//  108  211:putfield        #75  <Field boolean rotateThroughOnStart>
		rotateThroughSpeedMult = banneroptions.rotateThroughSpeedMult;
	//  109  214:aload_0         
	//  110  215:aload_1         
	//  111  216:getfield        #77  <Field int rotateThroughSpeedMult>
	//  112  219:putfield        #77  <Field int rotateThroughSpeedMult>
		refreshRate = banneroptions.refreshRate;
	//  113  222:aload_0         
	//  114  223:aload_1         
	//  115  224:getfield        #79  <Field int refreshRate>
	//  116  227:putfield        #79  <Field int refreshRate>
	//  117  230:return          
	}

	public int a()
	{
		return timeBetweenFrames;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int timeBetweenFrames>
	//    2    4:ireturn         
	}

	public void a(int i1, int j1)
	{
		width = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #42  <Field int width>
		height = j1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #44  <Field int height>
	//    6   10:return          
	}

	public int b()
	{
		return stepSize;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int stepSize>
	//    2    4:ireturn         
	}

	public int c()
	{
		return delayFaceTime;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int delayFaceTime>
	//    2    4:ireturn         
	}

	public int d()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field int width>
	//    2    4:ireturn         
	}

	public int e()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int height>
	//    2    4:ireturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		obj = ((Object) ((BannerOptions)obj));
	//    2    2:aload_1         
	//    3    3:checkcast       #2   <Class BannerOptions>
	//    4    6:astore_1        
		boolean flag = flag1;
	//    5    7:iload_3         
	//    6    8:istore_2        
		if(((BannerOptions) (obj)).f() == f())
	//*   7    9:aload_1         
	//*   8   10:invokevirtual   #92  <Method int f()>
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #92  <Method int f()>
	//*  11   17:icmpne          126
		{
			flag = flag1;
	//   12   20:iload_3         
	//   13   21:istore_2        
			if(((BannerOptions) (obj)).g() == g())
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #95  <Method int g()>
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #95  <Method int g()>
	//*  18   30:icmpne          126
			{
				flag = flag1;
	//   19   33:iload_3         
	//   20   34:istore_2        
				if(((BannerOptions) (obj)).h() == h())
	//*  21   35:aload_1         
	//*  22   36:invokevirtual   #98  <Method int h()>
	//*  23   39:aload_0         
	//*  24   40:invokevirtual   #98  <Method int h()>
	//*  25   43:icmpne          126
				{
					flag = flag1;
	//   26   46:iload_3         
	//   27   47:istore_2        
					if(((BannerOptions) (obj)).c() == c())
	//*  28   48:aload_1         
	//*  29   49:invokevirtual   #100 <Method int c()>
	//*  30   52:aload_0         
	//*  31   53:invokevirtual   #100 <Method int c()>
	//*  32   56:icmpne          126
					{
						flag = flag1;
	//   33   59:iload_3         
	//   34   60:istore_2        
						if(((BannerOptions) (obj)).e() == e())
	//*  35   61:aload_1         
	//*  36   62:invokevirtual   #102 <Method int e()>
	//*  37   65:aload_0         
	//*  38   66:invokevirtual   #102 <Method int e()>
	//*  39   69:icmpne          126
						{
							flag = flag1;
	//   40   72:iload_3         
	//   41   73:istore_2        
							if(((BannerOptions) (obj)).b() == b())
	//*  42   74:aload_1         
	//*  43   75:invokevirtual   #104 <Method int b()>
	//*  44   78:aload_0         
	//*  45   79:invokevirtual   #104 <Method int b()>
	//*  46   82:icmpne          126
							{
								flag = flag1;
	//   47   85:iload_3         
	//   48   86:istore_2        
								if(((BannerOptions) (obj)).a() == a())
	//*  49   87:aload_1         
	//*  50   88:invokevirtual   #106 <Method int a()>
	//*  51   91:aload_0         
	//*  52   92:invokevirtual   #106 <Method int a()>
	//*  53   95:icmpne          126
								{
									flag = flag1;
	//   54   98:iload_3         
	//   55   99:istore_2        
									if(((BannerOptions) (obj)).d() == d())
	//*  56  100:aload_1         
	//*  57  101:invokevirtual   #108 <Method int d()>
	//*  58  104:aload_0         
	//*  59  105:invokevirtual   #108 <Method int d()>
	//*  60  108:icmpne          126
									{
										flag = flag1;
	//   61  111:iload_3         
	//   62  112:istore_2        
										if(((BannerOptions) (obj)).i() == i())
	//*  63  113:aload_1         
	//*  64  114:invokevirtual   #111 <Method int i()>
	//*  65  117:aload_0         
	//*  66  118:invokevirtual   #111 <Method int i()>
	//*  67  121:icmpne          126
											flag = true;
	//   68  124:iconst_1        
	//   69  125:istore_2        
									}
								}
							}
						}
					}
				}
			}
		}
		return flag;
	//   70  126:iload_2         
	//   71  127:ireturn         
	}

	public int f()
	{
		return adsNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int adsNumber>
	//    2    4:ireturn         
	}

	public int g()
	{
		return htmlAdsNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int htmlAdsNumber>
	//    2    4:ireturn         
	}

	public int h()
	{
		return refreshRate3D;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int refreshRate3D>
	//    2    4:ireturn         
	}

	public int i()
	{
		return refreshRate;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int refreshRate>
	//    2    4:ireturn         
	}

	public float j()
	{
		return widthRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float widthRatio>
	//    2    4:freturn         
	}

	public float k()
	{
		return heightRatio;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float heightRatio>
	//    2    4:freturn         
	}

	public float l()
	{
		return minScale;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field float minScale>
	//    2    4:freturn         
	}

	public int m()
	{
		return scalePower;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int scalePower>
	//    2    4:ireturn         
	}

	public Effect n()
	{
		return effect;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field BannerOptions$Effect effect>
	//    2    4:areturn         
	}

	public boolean o()
	{
		return rotateThroughOnStart;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean rotateThroughOnStart>
	//    2    4:ireturn         
	}

	public int p()
	{
		return rotateThroughSpeedMult;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int rotateThroughSpeedMult>
	//    2    4:ireturn         
	}

	public int q()
	{
		return minViewabilityPercentage;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int minViewabilityPercentage>
	//    2    4:ireturn         
	}

	private static final long serialVersionUID = 1L;
	private int adsNumber;
	private int delayFaceTime;
	private Effect effect;
	private int height;
	private float heightRatio;
	private int htmlAdsNumber;
	private float minScale;
	private int minViewabilityPercentage;
	private int refreshRate;
	private int refreshRate3D;
	private boolean rotateThroughOnStart;
	private int rotateThroughSpeedMult;
	private int scalePower;
	private int stepSize;
	private int timeBetweenFrames;
	private int width;
	private float widthRatio;
}
