// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.splash;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.*;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import java.io.Serializable;

// Referenced classes of package com.startapp.android.publish.ads.splash:
//			i, d, f

public class SplashConfig
	implements Serializable
{
	public static final class MaxAdDisplayTime extends Enum
	{

		public static MaxAdDisplayTime getByIndex(long l)
		{
			MaxAdDisplayTime maxaddisplaytime = SHORT;
		//    0    0:getstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
		//    1    3:astore_3        
			MaxAdDisplayTime amaxaddisplaytime[] = values();
		//    2    4:invokestatic    #53  <Method SplashConfig$MaxAdDisplayTime[] values()>
		//    3    7:astore          4
			for(int j = 0; j < amaxaddisplaytime.length; j++)
		//*   4    9:iconst_0        
		//*   5   10:istore_2        
		//*   6   11:iload_2         
		//*   7   12:aload           4
		//*   8   14:arraylength     
		//*   9   15:icmpge          42
				if(amaxaddisplaytime[j].getIndex() == l)
		//*  10   18:aload           4
		//*  11   20:iload_2         
		//*  12   21:aaload          
		//*  13   22:invokevirtual   #57  <Method long getIndex()>
		//*  14   25:lload_0         
		//*  15   26:lcmp            
		//*  16   27:ifne            35
					maxaddisplaytime = amaxaddisplaytime[j];
		//   17   30:aload           4
		//   18   32:iload_2         
		//   19   33:aaload          
		//   20   34:astore_3        

		//   21   35:iload_2         
		//   22   36:iconst_1        
		//   23   37:iadd            
		//   24   38:istore_2        
		//*  25   39:goto            11
			return maxaddisplaytime;
		//   26   42:aload_3         
		//   27   43:areturn         
		}

		public static MaxAdDisplayTime getByName(String s)
		{
			MaxAdDisplayTime maxaddisplaytime = FOR_EVER;
		//    0    0:getstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
		//    1    3:astore_2        
			MaxAdDisplayTime amaxaddisplaytime[] = values();
		//    2    4:invokestatic    #53  <Method SplashConfig$MaxAdDisplayTime[] values()>
		//    3    7:astore_3        
			for(int j = 0; j < amaxaddisplaytime.length; j++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(amaxaddisplaytime[j].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #63  <Method String name()>
		//*  14   22:invokevirtual   #68  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #68  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #72  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					maxaddisplaytime = amaxaddisplaytime[j];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return maxaddisplaytime;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static MaxAdDisplayTime valueOf(String s)
		{
			return (MaxAdDisplayTime)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$MaxAdDisplayTime, s);
		//    0    0:ldc1            #2   <Class SplashConfig$MaxAdDisplayTime>
		//    1    2:aload_0         
		//    2    3:invokestatic    #76  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SplashConfig$MaxAdDisplayTime>
		//    4    9:areturn         
		}

		public static MaxAdDisplayTime[] values()
		{
			return (MaxAdDisplayTime[])((MaxAdDisplayTime []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field SplashConfig$MaxAdDisplayTime[] $VALUES>
		//    1    3:invokevirtual   #81  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$MaxAdDisplayTime_3B_.clone()>
		//    2    6:checkcast       #77  <Class SplashConfig$MaxAdDisplayTime[]>
		//    3    9:areturn         
		}

		public long getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field long index>
		//    2    4:lreturn         
		}

		private static final MaxAdDisplayTime $VALUES[];
		public static final MaxAdDisplayTime FOR_EVER;
		public static final MaxAdDisplayTime LONG;
		public static final MaxAdDisplayTime SHORT;
		private long index;

		static 
		{
			SHORT = new MaxAdDisplayTime("SHORT", 0, 5000L);
		//    0    0:new             #2   <Class SplashConfig$MaxAdDisplayTime>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "SHORT">
		//    3    6:iconst_0        
		//    4    7:ldc2w           #20  <Long 5000L>
		//    5   10:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
		//    6   13:putstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
			LONG = new MaxAdDisplayTime("LONG", 1, 10000L);
		//    7   16:new             #2   <Class SplashConfig$MaxAdDisplayTime>
		//    8   19:dup             
		//    9   20:ldc1            #28  <String "LONG">
		//   10   22:iconst_1        
		//   11   23:ldc2w           #29  <Long 10000L>
		//   12   26:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
		//   13   29:putstatic       #32  <Field SplashConfig$MaxAdDisplayTime LONG>
			FOR_EVER = new MaxAdDisplayTime("FOR_EVER", 2, 0x5265c00L);
		//   14   32:new             #2   <Class SplashConfig$MaxAdDisplayTime>
		//   15   35:dup             
		//   16   36:ldc1            #33  <String "FOR_EVER">
		//   17   38:iconst_2        
		//   18   39:ldc2w           #34  <Long 0x5265c00L>
		//   19   42:invokespecial   #25  <Method void SplashConfig$MaxAdDisplayTime(String, int, long)>
		//   20   45:putstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
			$VALUES = (new MaxAdDisplayTime[] {
				SHORT, LONG, FOR_EVER
			});
		//   21   48:iconst_3        
		//   22   49:anewarray       MaxAdDisplayTime[]
		//   23   52:dup             
		//   24   53:iconst_0        
		//   25   54:getstatic       #27  <Field SplashConfig$MaxAdDisplayTime SHORT>
		//   26   57:aastore         
		//   27   58:dup             
		//   28   59:iconst_1        
		//   29   60:getstatic       #32  <Field SplashConfig$MaxAdDisplayTime LONG>
		//   30   63:aastore         
		//   31   64:dup             
		//   32   65:iconst_2        
		//   33   66:getstatic       #37  <Field SplashConfig$MaxAdDisplayTime FOR_EVER>
		//   34   69:aastore         
		//   35   70:putstatic       #39  <Field SplashConfig$MaxAdDisplayTime[] $VALUES>
		//*  36   73:return          
		}

		private MaxAdDisplayTime(String s, int j, long l)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #43  <Method void Enum(String, int)>
			index = l;
		//    4    6:aload_0         
		//    5    7:lload_3         
		//    6    8:putfield        #45  <Field long index>
		//    7   11:return          
		}
	}

	public static final class MinSplashTime extends Enum
	{

		public static MinSplashTime getByIndex(long l)
		{
			MinSplashTime minsplashtime = SHORT;
		//    0    0:getstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
		//    1    3:astore_3        
			MinSplashTime aminsplashtime[] = values();
		//    2    4:invokestatic    #47  <Method SplashConfig$MinSplashTime[] values()>
		//    3    7:astore          4
			for(int j = 0; j < aminsplashtime.length; j++)
		//*   4    9:iconst_0        
		//*   5   10:istore_2        
		//*   6   11:iload_2         
		//*   7   12:aload           4
		//*   8   14:arraylength     
		//*   9   15:icmpge          42
				if(aminsplashtime[j].getIndex() == l)
		//*  10   18:aload           4
		//*  11   20:iload_2         
		//*  12   21:aaload          
		//*  13   22:invokevirtual   #51  <Method long getIndex()>
		//*  14   25:lload_0         
		//*  15   26:lcmp            
		//*  16   27:ifne            35
					minsplashtime = aminsplashtime[j];
		//   17   30:aload           4
		//   18   32:iload_2         
		//   19   33:aaload          
		//   20   34:astore_3        

		//   21   35:iload_2         
		//   22   36:iconst_1        
		//   23   37:iadd            
		//   24   38:istore_2        
		//*  25   39:goto            11
			return minsplashtime;
		//   26   42:aload_3         
		//   27   43:areturn         
		}

		public static MinSplashTime getByName(String s)
		{
			MinSplashTime minsplashtime = LONG;
		//    0    0:getstatic       #31  <Field SplashConfig$MinSplashTime LONG>
		//    1    3:astore_2        
			MinSplashTime aminsplashtime[] = values();
		//    2    4:invokestatic    #47  <Method SplashConfig$MinSplashTime[] values()>
		//    3    7:astore_3        
			for(int j = 0; j < aminsplashtime.length; j++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(aminsplashtime[j].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #57  <Method String name()>
		//*  14   22:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #66  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					minsplashtime = aminsplashtime[j];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return minsplashtime;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static MinSplashTime valueOf(String s)
		{
			return (MinSplashTime)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$MinSplashTime, s);
		//    0    0:ldc1            #2   <Class SplashConfig$MinSplashTime>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SplashConfig$MinSplashTime>
		//    4    9:areturn         
		}

		public static MinSplashTime[] values()
		{
			return (MinSplashTime[])((MinSplashTime []) ($VALUES)).clone();
		//    0    0:getstatic       #33  <Field SplashConfig$MinSplashTime[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$MinSplashTime_3B_.clone()>
		//    2    6:checkcast       #71  <Class SplashConfig$MinSplashTime[]>
		//    3    9:areturn         
		}

		public long getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field long index>
		//    2    4:lreturn         
		}

		private static final MinSplashTime $VALUES[];
		public static final MinSplashTime LONG;
		public static final MinSplashTime REGULAR;
		public static final MinSplashTime SHORT;
		private long index;

		static 
		{
			REGULAR = new MinSplashTime("REGULAR", 0, 3000);
		//    0    0:new             #2   <Class SplashConfig$MinSplashTime>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "REGULAR">
		//    3    6:iconst_0        
		//    4    7:sipush          3000
		//    5   10:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
		//    6   13:putstatic       #25  <Field SplashConfig$MinSplashTime REGULAR>
			SHORT = new MinSplashTime("SHORT", 1, 2000);
		//    7   16:new             #2   <Class SplashConfig$MinSplashTime>
		//    8   19:dup             
		//    9   20:ldc1            #26  <String "SHORT">
		//   10   22:iconst_1        
		//   11   23:sipush          2000
		//   12   26:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
		//   13   29:putstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
			LONG = new MinSplashTime("LONG", 2, 5000);
		//   14   32:new             #2   <Class SplashConfig$MinSplashTime>
		//   15   35:dup             
		//   16   36:ldc1            #29  <String "LONG">
		//   17   38:iconst_2        
		//   18   39:sipush          5000
		//   19   42:invokespecial   #23  <Method void SplashConfig$MinSplashTime(String, int, int)>
		//   20   45:putstatic       #31  <Field SplashConfig$MinSplashTime LONG>
			$VALUES = (new MinSplashTime[] {
				REGULAR, SHORT, LONG
			});
		//   21   48:iconst_3        
		//   22   49:anewarray       MinSplashTime[]
		//   23   52:dup             
		//   24   53:iconst_0        
		//   25   54:getstatic       #25  <Field SplashConfig$MinSplashTime REGULAR>
		//   26   57:aastore         
		//   27   58:dup             
		//   28   59:iconst_1        
		//   29   60:getstatic       #28  <Field SplashConfig$MinSplashTime SHORT>
		//   30   63:aastore         
		//   31   64:dup             
		//   32   65:iconst_2        
		//   33   66:getstatic       #31  <Field SplashConfig$MinSplashTime LONG>
		//   34   69:aastore         
		//   35   70:putstatic       #33  <Field SplashConfig$MinSplashTime[] $VALUES>
		//*  36   73:return          
		}

		private MinSplashTime(String s, int j, int k)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
			index = k;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:i2l             
		//    7    9:putfield        #39  <Field long index>
		//    8   12:return          
		}
	}

	public static final class Orientation extends Enum
	{

		public static Orientation getByIndex(int j)
		{
			Orientation orientation = PORTRAIT;
		//    0    0:getstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
		//    1    3:astore_2        
			Orientation aorientation[] = values();
		//    2    4:invokestatic    #47  <Method SplashConfig$Orientation[] values()>
		//    3    7:astore_3        
			for(int k = 0; k < aorientation.length; k++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          37
				if(aorientation[k].getIndex() == j)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #51  <Method int getIndex()>
		//*  14   22:iload_0         
		//*  15   23:icmpne          30
					orientation = aorientation[k];
		//   16   26:aload_3         
		//   17   27:iload_1         
		//   18   28:aaload          
		//   19   29:astore_2        

		//   20   30:iload_1         
		//   21   31:iconst_1        
		//   22   32:iadd            
		//   23   33:istore_1        
		//*  24   34:goto            10
			return orientation;
		//   25   37:aload_2         
		//   26   38:areturn         
		}

		public static Orientation getByName(String s)
		{
			Orientation orientation = AUTO;
		//    0    0:getstatic       #31  <Field SplashConfig$Orientation AUTO>
		//    1    3:astore_2        
			Orientation aorientation[] = values();
		//    2    4:invokestatic    #47  <Method SplashConfig$Orientation[] values()>
		//    3    7:astore_3        
			for(int j = 0; j < aorientation.length; j++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(aorientation[j].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #57  <Method String name()>
		//*  14   22:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #62  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #66  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					orientation = aorientation[j];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return orientation;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static Orientation valueOf(String s)
		{
			return (Orientation)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$Orientation, s);
		//    0    0:ldc1            #2   <Class SplashConfig$Orientation>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SplashConfig$Orientation>
		//    4    9:areturn         
		}

		public static Orientation[] values()
		{
			return (Orientation[])((Orientation []) ($VALUES)).clone();
		//    0    0:getstatic       #33  <Field SplashConfig$Orientation[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$Orientation_3B_.clone()>
		//    2    6:checkcast       #71  <Class SplashConfig$Orientation[]>
		//    3    9:areturn         
		}

		public int getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int index>
		//    2    4:ireturn         
		}

		private static final Orientation $VALUES[];
		public static final Orientation AUTO;
		public static final Orientation LANDSCAPE;
		public static final Orientation PORTRAIT;
		private int index;

		static 
		{
			PORTRAIT = new Orientation("PORTRAIT", 0, 1);
		//    0    0:new             #2   <Class SplashConfig$Orientation>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "PORTRAIT">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
		//    6   11:putstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
			LANDSCAPE = new Orientation("LANDSCAPE", 1, 2);
		//    7   14:new             #2   <Class SplashConfig$Orientation>
		//    8   17:dup             
		//    9   18:ldc1            #26  <String "LANDSCAPE">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
		//   13   25:putstatic       #28  <Field SplashConfig$Orientation LANDSCAPE>
			AUTO = new Orientation("AUTO", 2, 3);
		//   14   28:new             #2   <Class SplashConfig$Orientation>
		//   15   31:dup             
		//   16   32:ldc1            #29  <String "AUTO">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #23  <Method void SplashConfig$Orientation(String, int, int)>
		//   20   39:putstatic       #31  <Field SplashConfig$Orientation AUTO>
			$VALUES = (new Orientation[] {
				PORTRAIT, LANDSCAPE, AUTO
			});
		//   21   42:iconst_3        
		//   22   43:anewarray       Orientation[]
		//   23   46:dup             
		//   24   47:iconst_0        
		//   25   48:getstatic       #25  <Field SplashConfig$Orientation PORTRAIT>
		//   26   51:aastore         
		//   27   52:dup             
		//   28   53:iconst_1        
		//   29   54:getstatic       #28  <Field SplashConfig$Orientation LANDSCAPE>
		//   30   57:aastore         
		//   31   58:dup             
		//   32   59:iconst_2        
		//   33   60:getstatic       #31  <Field SplashConfig$Orientation AUTO>
		//   34   63:aastore         
		//   35   64:putstatic       #33  <Field SplashConfig$Orientation[] $VALUES>
		//*  36   67:return          
		}

		private Orientation(String s, int j, int k)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
			index = k;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #39  <Field int index>
		//    7   11:return          
		}
	}

	public static final class Theme extends Enum
	{

		public static Theme getByIndex(int j)
		{
			Theme theme = DEEP_BLUE;
		//    0    0:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
		//    1    3:astore_2        
			Theme atheme[] = values();
		//    2    4:invokestatic    #63  <Method SplashConfig$Theme[] values()>
		//    3    7:astore_3        
			for(int k = 0; k < atheme.length; k++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          37
				if(atheme[k].getIndex() == j)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #67  <Method int getIndex()>
		//*  14   22:iload_0         
		//*  15   23:icmpne          30
					theme = atheme[k];
		//   16   26:aload_3         
		//   17   27:iload_1         
		//   18   28:aaload          
		//   19   29:astore_2        

		//   20   30:iload_1         
		//   21   31:iconst_1        
		//   22   32:iadd            
		//   23   33:istore_1        
		//*  24   34:goto            10
			return theme;
		//   25   37:aload_2         
		//   26   38:areturn         
		}

		public static Theme getByName(String s)
		{
			Theme theme = DEEP_BLUE;
		//    0    0:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
		//    1    3:astore_2        
			Theme atheme[] = values();
		//    2    4:invokestatic    #63  <Method SplashConfig$Theme[] values()>
		//    3    7:astore_3        
			for(int j = 0; j < atheme.length; j++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:aload_3         
		//*   8   12:arraylength     
		//*   9   13:icmpge          46
				if(atheme[j].name().toLowerCase().compareTo(s.toLowerCase()) == 0)
		//*  10   16:aload_3         
		//*  11   17:iload_1         
		//*  12   18:aaload          
		//*  13   19:invokevirtual   #73  <Method String name()>
		//*  14   22:invokevirtual   #78  <Method String String.toLowerCase()>
		//*  15   25:aload_0         
		//*  16   26:invokevirtual   #78  <Method String String.toLowerCase()>
		//*  17   29:invokevirtual   #82  <Method int String.compareTo(String)>
		//*  18   32:ifne            39
					theme = atheme[j];
		//   19   35:aload_3         
		//   20   36:iload_1         
		//   21   37:aaload          
		//   22   38:astore_2        

		//   23   39:iload_1         
		//   24   40:iconst_1        
		//   25   41:iadd            
		//   26   42:istore_1        
		//*  27   43:goto            10
			return theme;
		//   28   46:aload_2         
		//   29   47:areturn         
		}

		public static Theme valueOf(String s)
		{
			return (Theme)Enum.valueOf(com/startapp/android/publish/ads/splash/SplashConfig$Theme, s);
		//    0    0:ldc1            #2   <Class SplashConfig$Theme>
		//    1    2:aload_0         
		//    2    3:invokestatic    #86  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SplashConfig$Theme>
		//    4    9:areturn         
		}

		public static Theme[] values()
		{
			return (Theme[])((Theme []) ($VALUES)).clone();
		//    0    0:getstatic       #49  <Field SplashConfig$Theme[] $VALUES>
		//    1    3:invokevirtual   #91  <Method Object _5B_Lcom.startapp.android.publish.ads.splash.SplashConfig$Theme_3B_.clone()>
		//    2    6:checkcast       #87  <Class SplashConfig$Theme[]>
		//    3    9:areturn         
		}

		public int getIndex()
		{
			return index;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field int index>
		//    2    4:ireturn         
		}

		private static final Theme $VALUES[];
		public static final Theme ASHEN_SKY;
		public static final Theme BLAZE;
		public static final Theme DEEP_BLUE;
		public static final Theme GLOOMY;
		public static final Theme OCEAN;
		public static final Theme SKY;
		public static final Theme USER_DEFINED;
		private int index;

		static 
		{
			DEEP_BLUE = new Theme("DEEP_BLUE", 0, 1);
		//    0    0:new             #2   <Class SplashConfig$Theme>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "DEEP_BLUE">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//    6   11:putstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
			SKY = new Theme("SKY", 1, 2);
		//    7   14:new             #2   <Class SplashConfig$Theme>
		//    8   17:dup             
		//    9   18:ldc1            #30  <String "SKY">
		//   10   20:iconst_1        
		//   11   21:iconst_2        
		//   12   22:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   13   25:putstatic       #32  <Field SplashConfig$Theme SKY>
			ASHEN_SKY = new Theme("ASHEN_SKY", 2, 3);
		//   14   28:new             #2   <Class SplashConfig$Theme>
		//   15   31:dup             
		//   16   32:ldc1            #33  <String "ASHEN_SKY">
		//   17   34:iconst_2        
		//   18   35:iconst_3        
		//   19   36:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   20   39:putstatic       #35  <Field SplashConfig$Theme ASHEN_SKY>
			BLAZE = new Theme("BLAZE", 3, 4);
		//   21   42:new             #2   <Class SplashConfig$Theme>
		//   22   45:dup             
		//   23   46:ldc1            #36  <String "BLAZE">
		//   24   48:iconst_3        
		//   25   49:iconst_4        
		//   26   50:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   27   53:putstatic       #38  <Field SplashConfig$Theme BLAZE>
			GLOOMY = new Theme("GLOOMY", 4, 5);
		//   28   56:new             #2   <Class SplashConfig$Theme>
		//   29   59:dup             
		//   30   60:ldc1            #39  <String "GLOOMY">
		//   31   62:iconst_4        
		//   32   63:iconst_5        
		//   33   64:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   34   67:putstatic       #41  <Field SplashConfig$Theme GLOOMY>
			OCEAN = new Theme("OCEAN", 5, 6);
		//   35   70:new             #2   <Class SplashConfig$Theme>
		//   36   73:dup             
		//   37   74:ldc1            #42  <String "OCEAN">
		//   38   76:iconst_5        
		//   39   77:bipush          6
		//   40   79:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   41   82:putstatic       #44  <Field SplashConfig$Theme OCEAN>
			USER_DEFINED = new Theme("USER_DEFINED", 6, 0);
		//   42   85:new             #2   <Class SplashConfig$Theme>
		//   43   88:dup             
		//   44   89:ldc1            #45  <String "USER_DEFINED">
		//   45   91:bipush          6
		//   46   93:iconst_0        
		//   47   94:invokespecial   #27  <Method void SplashConfig$Theme(String, int, int)>
		//   48   97:putstatic       #47  <Field SplashConfig$Theme USER_DEFINED>
			$VALUES = (new Theme[] {
				DEEP_BLUE, SKY, ASHEN_SKY, BLAZE, GLOOMY, OCEAN, USER_DEFINED
			});
		//   49  100:bipush          7
		//   50  102:anewarray       Theme[]
		//   51  105:dup             
		//   52  106:iconst_0        
		//   53  107:getstatic       #29  <Field SplashConfig$Theme DEEP_BLUE>
		//   54  110:aastore         
		//   55  111:dup             
		//   56  112:iconst_1        
		//   57  113:getstatic       #32  <Field SplashConfig$Theme SKY>
		//   58  116:aastore         
		//   59  117:dup             
		//   60  118:iconst_2        
		//   61  119:getstatic       #35  <Field SplashConfig$Theme ASHEN_SKY>
		//   62  122:aastore         
		//   63  123:dup             
		//   64  124:iconst_3        
		//   65  125:getstatic       #38  <Field SplashConfig$Theme BLAZE>
		//   66  128:aastore         
		//   67  129:dup             
		//   68  130:iconst_4        
		//   69  131:getstatic       #41  <Field SplashConfig$Theme GLOOMY>
		//   70  134:aastore         
		//   71  135:dup             
		//   72  136:iconst_5        
		//   73  137:getstatic       #44  <Field SplashConfig$Theme OCEAN>
		//   74  140:aastore         
		//   75  141:dup             
		//   76  142:bipush          6
		//   77  144:getstatic       #47  <Field SplashConfig$Theme USER_DEFINED>
		//   78  147:aastore         
		//   79  148:putstatic       #49  <Field SplashConfig$Theme[] $VALUES>
		//*  80  151:return          
		}

		private Theme(String s, int j, int k)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
			index = k;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #55  <Field int index>
		//    7   11:return          
		}
	}


	public SplashConfig()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #108 <Method void Object()>
		forceNative = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #110 <Field boolean forceNative>
		customScreen = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #112 <Field int customScreen>
		appName = "";
	//    8   14:aload_0         
	//    9   15:ldc1            #31  <String "">
	//   10   17:putfield        #114 <Field String appName>
		logo = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #116 <Field Drawable logo>
		logoByteArray = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #118 <Field byte[] logoByteArray>
		logoRes = -1;
	//   17   30:aload_0         
	//   18   31:iconst_m1       
	//   19   32:putfield        #120 <Field int logoRes>
		defaultTheme = VALUE_DEFAULT_THEME;
	//   20   35:aload_0         
	//   21   36:getstatic       #87  <Field SplashConfig$Theme VALUE_DEFAULT_THEME>
	//   22   39:putfield        #122 <Field SplashConfig$Theme defaultTheme>
		defaultMinSplashTime = VALUE_DEFAULT_MINSPLASHTIME;
	//   23   42:aload_0         
	//   24   43:getstatic       #92  <Field SplashConfig$MinSplashTime VALUE_DEFAULT_MINSPLASHTIME>
	//   25   46:putfield        #124 <Field SplashConfig$MinSplashTime defaultMinSplashTime>
		defaultMaxLoadTime = Long.valueOf(VALUE_DEFAULT_MAXLOAD);
	//   26   49:aload_0         
	//   27   50:getstatic       #94  <Field long VALUE_DEFAULT_MAXLOAD>
	//   28   53:invokestatic    #130 <Method Long Long.valueOf(long)>
	//   29   56:putfield        #132 <Field Long defaultMaxLoadTime>
		defaultMaxAdDisplayTime = VALUE_DEFAULT_MAXADDISPLAY;
	//   30   59:aload_0         
	//   31   60:getstatic       #99  <Field SplashConfig$MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY>
	//   32   63:putfield        #134 <Field SplashConfig$MaxAdDisplayTime defaultMaxAdDisplayTime>
		defaultOrientation = VALUE_DEFAULT_ORIENTATION;
	//   33   66:aload_0         
	//   34   67:getstatic       #104 <Field SplashConfig$Orientation VALUE_DEFAULT_ORIENTATION>
	//   35   70:putfield        #136 <Field SplashConfig$Orientation defaultOrientation>
		htmlSplash = true;
	//   36   73:aload_0         
	//   37   74:iconst_1        
	//   38   75:putfield        #138 <Field boolean htmlSplash>
		splashBgColor = "#066CAA";
	//   39   78:aload_0         
	//   40   79:ldc1            #34  <String "#066CAA">
	//   41   81:putfield        #140 <Field String splashBgColor>
		splashFontColor = "ffffff";
	//   42   84:aload_0         
	//   43   85:ldc1            #37  <String "ffffff">
	//   44   87:putfield        #142 <Field String splashFontColor>
		splashLoadingType = "LoadingDots";
	//   45   90:aload_0         
	//   46   91:ldc1            #40  <String "LoadingDots">
	//   47   93:putfield        #144 <Field String splashLoadingType>
		errMsg = "";
	//   48   96:aload_0         
	//   49   97:ldc1            #31  <String "">
	//   50   99:putfield        #146 <Field String errMsg>
	//   51  102:return          
	}

	private static void applyDefaultSplashConfig(SplashConfig splashconfig, Context context)
	{
		SplashConfig splashconfig1 = getDefaultSplashConfig();
	//    0    0:invokestatic    #152 <Method SplashConfig getDefaultSplashConfig()>
	//    1    3:astore_2        
		if(splashconfig.getTheme() == null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//*   4    8:ifnonnull       20
			splashconfig.setTheme(splashconfig1.getTheme());
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//    8   16:invokevirtual   #160 <Method SplashConfig setTheme(SplashConfig$Theme)>
	//    9   19:pop             
		if(splashconfig.getMinSplashTime() == null)
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #164 <Method SplashConfig$MinSplashTime getMinSplashTime()>
	//*  12   24:ifnonnull       36
			splashconfig.setMinSplashTime(splashconfig1.getMinSplashTime());
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #164 <Method SplashConfig$MinSplashTime getMinSplashTime()>
	//   16   32:invokevirtual   #168 <Method SplashConfig setMinSplashTime(SplashConfig$MinSplashTime)>
	//   17   35:pop             
		if(splashconfig.getMaxLoadAdTimeout() == null)
	//*  18   36:aload_0         
	//*  19   37:invokevirtual   #172 <Method Long getMaxLoadAdTimeout()>
	//*  20   40:ifnonnull       55
			splashconfig.setMaxLoadAdTimeout(splashconfig1.getMaxLoadAdTimeout().longValue());
	//   21   43:aload_0         
	//   22   44:aload_2         
	//   23   45:invokevirtual   #172 <Method Long getMaxLoadAdTimeout()>
	//   24   48:invokevirtual   #176 <Method long Long.longValue()>
	//   25   51:invokevirtual   #180 <Method SplashConfig setMaxLoadAdTimeout(long)>
	//   26   54:pop             
		if(splashconfig.getMaxAdDisplayTime() == null)
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #184 <Method SplashConfig$MaxAdDisplayTime getMaxAdDisplayTime()>
	//*  29   59:ifnonnull       71
			splashconfig.setMaxAdDisplayTime(splashconfig1.getMaxAdDisplayTime());
	//   30   62:aload_0         
	//   31   63:aload_2         
	//   32   64:invokevirtual   #184 <Method SplashConfig$MaxAdDisplayTime getMaxAdDisplayTime()>
	//   33   67:invokevirtual   #188 <Method SplashConfig setMaxAdDisplayTime(SplashConfig$MaxAdDisplayTime)>
	//   34   70:pop             
		if(splashconfig.getOrientation() == null)
	//*  35   71:aload_0         
	//*  36   72:invokevirtual   #192 <Method SplashConfig$Orientation getOrientation()>
	//*  37   75:ifnonnull       87
			splashconfig.setOrientation(splashconfig1.getOrientation());
	//   38   78:aload_0         
	//   39   79:aload_2         
	//   40   80:invokevirtual   #192 <Method SplashConfig$Orientation getOrientation()>
	//   41   83:invokevirtual   #196 <Method SplashConfig setOrientation(SplashConfig$Orientation)>
	//   42   86:pop             
		if(splashconfig.getLoadingType() == null)
	//*  43   87:aload_0         
	//*  44   88:invokevirtual   #200 <Method String getLoadingType()>
	//*  45   91:ifnonnull       103
			splashconfig.setLoadingType(splashconfig1.getLoadingType());
	//   46   94:aload_0         
	//   47   95:aload_2         
	//   48   96:invokevirtual   #200 <Method String getLoadingType()>
	//   49   99:invokevirtual   #204 <Method SplashConfig setLoadingType(String)>
	//   50  102:pop             
		if(splashconfig.getAppName().equals(""))
	//*  51  103:aload_0         
	//*  52  104:invokevirtual   #207 <Method String getAppName()>
	//*  53  107:ldc1            #31  <String "">
	//*  54  109:invokevirtual   #213 <Method boolean String.equals(Object)>
	//*  55  112:ifeq            126
			splashconfig.setAppName(c.a(context, "Welcome!"));
	//   56  115:aload_0         
	//   57  116:aload_1         
	//   58  117:ldc1            #215 <String "Welcome!">
	//   59  119:invokestatic    #221 <Method String c.a(Context, String)>
	//   60  122:invokevirtual   #224 <Method SplashConfig setAppName(String)>
	//   61  125:pop             
	//   62  126:return          
	}

	public static SplashConfig getDefaultSplashConfig()
	{
		SplashConfig splashconfig = new SplashConfig();
	//    0    0:new             #2   <Class SplashConfig>
	//    1    3:dup             
	//    2    4:invokespecial   #225 <Method void SplashConfig()>
	//    3    7:astore_0        
		splashconfig.setTheme(VALUE_DEFAULT_THEME).setMinSplashTime(VALUE_DEFAULT_MINSPLASHTIME).setMaxLoadAdTimeout(VALUE_DEFAULT_MAXLOAD).setMaxAdDisplayTime(VALUE_DEFAULT_MAXADDISPLAY).setOrientation(VALUE_DEFAULT_ORIENTATION).setLoadingType("LoadingDots").setAppName("");
	//    4    8:aload_0         
	//    5    9:getstatic       #87  <Field SplashConfig$Theme VALUE_DEFAULT_THEME>
	//    6   12:invokevirtual   #160 <Method SplashConfig setTheme(SplashConfig$Theme)>
	//    7   15:getstatic       #92  <Field SplashConfig$MinSplashTime VALUE_DEFAULT_MINSPLASHTIME>
	//    8   18:invokevirtual   #168 <Method SplashConfig setMinSplashTime(SplashConfig$MinSplashTime)>
	//    9   21:getstatic       #94  <Field long VALUE_DEFAULT_MAXLOAD>
	//   10   24:invokevirtual   #180 <Method SplashConfig setMaxLoadAdTimeout(long)>
	//   11   27:getstatic       #99  <Field SplashConfig$MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY>
	//   12   30:invokevirtual   #188 <Method SplashConfig setMaxAdDisplayTime(SplashConfig$MaxAdDisplayTime)>
	//   13   33:getstatic       #104 <Field SplashConfig$Orientation VALUE_DEFAULT_ORIENTATION>
	//   14   36:invokevirtual   #196 <Method SplashConfig setOrientation(SplashConfig$Orientation)>
	//   15   39:ldc1            #40  <String "LoadingDots">
	//   16   41:invokevirtual   #204 <Method SplashConfig setLoadingType(String)>
	//   17   44:ldc1            #31  <String "">
	//   18   46:invokevirtual   #224 <Method SplashConfig setAppName(String)>
	//   19   49:pop             
		return splashconfig;
	//   20   50:aload_0         
	//   21   51:areturn         
	}

	private void setErrorMsg(String s)
	{
		errMsg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #146 <Field String errMsg>
	//    3    5:return          
	}

	private SplashConfig setLogo(Drawable drawable)
	{
		logo = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #116 <Field Drawable logo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private void setSplashColorsByTheme(Theme theme)
	{
		String s;
		String s1;
		s = "#066CAA";
	//    0    0:ldc1            #34  <String "#066CAA">
	//    1    2:astore_2        
		s1 = "ffffff";
	//    2    3:ldc1            #37  <String "ffffff">
	//    3    5:astore_3        
		static class _cls1
		{

			static final int $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[];

			static 
			{
				$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme = new int[Theme.values().length];
			//    0    0:invokestatic    #18  <Method SplashConfig$Theme[] SplashConfig$Theme.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.DEEP_BLUE.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//    5   12:getstatic       #24  <Field SplashConfig$Theme SplashConfig$Theme.DEEP_BLUE>
			//    6   15:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  10   23:getstatic       #31  <Field SplashConfig$Theme SplashConfig$Theme.SKY>
			//*  11   26:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  15   34:getstatic       #34  <Field SplashConfig$Theme SplashConfig$Theme.ASHEN_SKY>
			//*  16   37:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  20   45:getstatic       #37  <Field SplashConfig$Theme SplashConfig$Theme.BLAZE>
			//*  21   48:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  25   56:getstatic       #40  <Field SplashConfig$Theme SplashConfig$Theme.GLOOMY>
			//*  26   59:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  30   67:getstatic       #43  <Field SplashConfig$Theme SplashConfig$Theme.OCEAN>
			//*  31   70:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
			//*  35   79:getstatic       #46  <Field SplashConfig$Theme SplashConfig$Theme.USER_DEFINED>
			//*  36   82:invokevirtual   #28  <Method int SplashConfig$Theme.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:return          
			//*  40   89:astore_0        
			//*  41   90:return          
			//*  42   91:astore_0        
			//*  43   92:goto            76
			//*  44   95:astore_0        
			//*  45   96:goto            64
			//*  46   99:astore_0        
			//*  47  100:goto            53
			//*  48  103:astore_0        
			//*  49  104:goto            42
			//*  50  107:astore_0        
			//*  51  108:goto            31
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   52  111:astore_0        
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.SKY.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.ASHEN_SKY.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.BLAZE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.GLOOMY.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.OCEAN.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme[Theme.USER_DEFINED.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  53  112:goto            20
			}
		}

		_cls1..SwitchMap.com.startapp.android.publish.ads.splash.SplashConfig.Theme[theme.ordinal()];
	//    4    6:getstatic       #235 <Field int[] SplashConfig$1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #239 <Method int SplashConfig$Theme.ordinal()>
	//    7   13:iaload          
		JVM INSTR tableswitch 1 6: default 52
	//	               1 65
	//	               2 74
	//	               3 83
	//	               4 92
	//	               5 101
	//	               6 110;
	//    8   14:tableswitch     1 6: default 52
	//	               1 65
	//	               2 74
	//	               3 83
	//	               4 92
	//	               5 101
	//	               6 110
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
		theme = ((Theme) (s1));
	//    9   52:aload_3         
	//   10   53:astore_1        
_L9:
		splashBgColor = s;
	//   11   54:aload_0         
	//   12   55:aload_2         
	//   13   56:putfield        #140 <Field String splashBgColor>
		splashFontColor = ((String) (theme));
	//   14   59:aload_0         
	//   15   60:aload_1         
	//   16   61:putfield        #142 <Field String splashFontColor>
		return;
	//   17   64:return          
_L2:
		theme = "#FFFFFF";
	//   18   65:ldc1            #241 <String "#FFFFFF">
	//   19   67:astore_1        
		s = "#066CAA";
	//   20   68:ldc1            #34  <String "#066CAA">
	//   21   70:astore_2        
		continue; /* Loop/switch isn't completed */
	//   22   71:goto            54
_L3:
		theme = "#333333";
	//   23   74:ldc1            #243 <String "#333333">
	//   24   76:astore_1        
		s = "#a3d4e5";
	//   25   77:ldc1            #245 <String "#a3d4e5">
	//   26   79:astore_2        
		continue; /* Loop/switch isn't completed */
	//   27   80:goto            54
_L4:
		theme = "#333333";
	//   28   83:ldc1            #243 <String "#333333">
	//   29   85:astore_1        
		s = "#E3E3E3";
	//   30   86:ldc1            #247 <String "#E3E3E3">
	//   31   88:astore_2        
		continue; /* Loop/switch isn't completed */
	//   32   89:goto            54
_L5:
		theme = "#FFFFFF";
	//   33   92:ldc1            #241 <String "#FFFFFF">
	//   34   94:astore_1        
		s = "#FF6600";
	//   35   95:ldc1            #249 <String "#FF6600">
	//   36   97:astore_2        
		continue; /* Loop/switch isn't completed */
	//   37   98:goto            54
_L6:
		theme = "#33B5E5";
	//   38  101:ldc1            #251 <String "#33B5E5">
	//   39  103:astore_1        
		s = "#2F353F";
	//   40  104:ldc1            #253 <String "#2F353F">
	//   41  106:astore_2        
		continue; /* Loop/switch isn't completed */
	//   42  107:goto            54
_L7:
		theme = "#063D51";
	//   43  110:ldc1            #255 <String "#063D51">
	//   44  112:astore_1        
		s = "#237C9A";
	//   45  113:ldc2            #257 <String "#237C9A">
	//   46  116:astore_2        
		if(true) goto _L9; else goto _L8
	//   47  117:goto            54
_L8:
	}

	public String getAppName()
	{
		return appName;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field String appName>
	//    2    4:areturn         
	}

	public String getBgColor()
	{
		return splashBgColor;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field String splashBgColor>
	//    2    4:areturn         
	}

	public int getCustomScreen()
	{
		return customScreen;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int customScreen>
	//    2    4:ireturn         
	}

	public String getErrorMessage()
	{
		return errMsg;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field String errMsg>
	//    2    4:areturn         
	}

	public String getFontColor()
	{
		return splashFontColor;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String splashFontColor>
	//    2    4:areturn         
	}

	protected View getLayout(Context context)
	{
		switch(_cls1..SwitchMap.com.startapp.android.publish.ads.splash.SplashConfig.Theme[getTheme().ordinal()])
	//*   0    0:getstatic       #235 <Field int[] SplashConfig$1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//*   3    7:invokevirtual   #239 <Method int SplashConfig$Theme.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     7 7: default 28
	//	               7 34
		default:
			return i.a(context, this);
	//    6   28:aload_1         
	//    7   29:aload_0         
	//    8   30:invokestatic    #274 <Method View i.a(Context, SplashConfig)>
	//    9   33:areturn         

		case 7: // '\007'
			break;
		}
		View view;
		try
		{
			view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(getCustomScreen(), ((android.view.ViewGroup) (null)));
	//   10   34:aload_1         
	//   11   35:ldc2            #276 <String "layout_inflater">
	//   12   38:invokevirtual   #282 <Method Object Context.getSystemService(String)>
	//   13   41:checkcast       #284 <Class LayoutInflater>
	//   14   44:aload_0         
	//   15   45:invokevirtual   #286 <Method int getCustomScreen()>
	//   16   48:aconst_null     
	//   17   49:invokevirtual   #290 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   18   52:astore_2        
		}
	//*  19   53:aload_2         
	//*  20   54:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  21   55:astore_1        
		{
			throw new android.content.res.Resources.NotFoundException("StartApp: Can't find Custom layout resource");
	//   22   56:new             #265 <Class android.content.res.Resources$NotFoundException>
	//   23   59:dup             
	//   24   60:ldc2            #292 <String "StartApp: Can't find Custom layout resource">
	//   25   63:invokespecial   #294 <Method void android.content.res.Resources$NotFoundException(String)>
	//   26   66:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   67:astore_1        
		{
			throw new InflateException("StartApp: Can't inflate layout in Custom mode, Are you sure layout resource is valid?");
	//   28   68:new             #267 <Class InflateException>
	//   29   71:dup             
	//   30   72:ldc2            #296 <String "StartApp: Can't inflate layout in Custom mode, Are you sure layout resource is valid?">
	//   31   75:invokespecial   #297 <Method void InflateException(String)>
	//   32   78:athrow          
		}
		catch(Exception exception)
	//*  33   79:astore_2        
		{
			f.a(context, d.b, "SplashConfig.getLayout - System service failed", exception.getMessage(), "");
	//   34   80:aload_1         
	//   35   81:getstatic       #302 <Field d d.b>
	//   36   84:ldc2            #304 <String "SplashConfig.getLayout - System service failed">
	//   37   87:aload_2         
	//   38   88:invokevirtual   #307 <Method String Exception.getMessage()>
	//   39   91:ldc1            #31  <String "">
	//   40   93:invokestatic    #312 <Method void f.a(Context, d, String, String, String)>
			return null;
	//   41   96:aconst_null     
	//   42   97:areturn         
		}
		return view;
	}

	public String getLoadingType()
	{
		return splashLoadingType;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field String splashLoadingType>
	//    2    4:areturn         
	}

	public Drawable getLogo()
	{
		return logo;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Drawable logo>
	//    2    4:areturn         
	}

	public byte[] getLogoByteArray()
	{
		return logoByteArray;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field byte[] logoByteArray>
	//    2    4:areturn         
	}

	public int getLogoRes()
	{
		return logoRes;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field int logoRes>
	//    2    4:ireturn         
	}

	public MaxAdDisplayTime getMaxAdDisplayTime()
	{
		return defaultMaxAdDisplayTime;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field SplashConfig$MaxAdDisplayTime defaultMaxAdDisplayTime>
	//    2    4:areturn         
	}

	protected Long getMaxLoadAdTimeout()
	{
		return defaultMaxLoadTime;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Long defaultMaxLoadTime>
	//    2    4:areturn         
	}

	public MinSplashTime getMinSplashTime()
	{
		return defaultMinSplashTime;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field SplashConfig$MinSplashTime defaultMinSplashTime>
	//    2    4:areturn         
	}

	public Orientation getOrientation()
	{
		return defaultOrientation;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field SplashConfig$Orientation defaultOrientation>
	//    2    4:areturn         
	}

	protected Theme getTheme()
	{
		return defaultTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field SplashConfig$Theme defaultTheme>
	//    2    4:areturn         
	}

	protected com.startapp.android.publish.ads.splash.d initSplashHtml(Activity activity)
	{
		setSplashColorsByTheme(getTheme());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//    3    5:invokespecial   #321 <Method void setSplashColorsByTheme(SplashConfig$Theme)>
		activity = ((Activity) (new com.startapp.android.publish.ads.splash.d(activity)));
	//    4    8:new             #323 <Class com.startapp.android.publish.ads.splash.d>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #326 <Method void com.startapp.android.publish.ads.splash.d(Activity)>
	//    8   16:astore_1        
		((com.startapp.android.publish.ads.splash.d) (activity)).b(this);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #329 <Method void d.b(SplashConfig)>
		((com.startapp.android.publish.ads.splash.d) (activity)).a(this);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #331 <Method void d.a(SplashConfig)>
		return ((com.startapp.android.publish.ads.splash.d) (activity));
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	protected void initSplashLogo(Activity activity)
	{
		if(getLogo() == null && getLogoRes() == -1 && getLogoByteArray() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #334 <Method Drawable getLogo()>
	//*   2    4:ifnonnull       52
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #336 <Method int getLogoRes()>
	//*   5   11:iconst_m1       
	//*   6   12:icmpne          52
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #338 <Method byte[] getLogoByteArray()>
	//*   9   19:ifnull          52
		{
			byte abyte0[] = getLogoByteArray();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #338 <Method byte[] getLogoByteArray()>
	//   12   26:astore_2        
			android.graphics.Bitmap bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
	//   13   27:aload_2         
	//   14   28:iconst_0        
	//   15   29:aload_2         
	//   16   30:arraylength     
	//   17   31:invokestatic    #344 <Method android.graphics.Bitmap BitmapFactory.decodeByteArray(byte[], int, int)>
	//   18   34:astore_2        
			setLogo(((Drawable) (new BitmapDrawable(activity.getResources(), bitmap))));
	//   19   35:aload_0         
	//   20   36:new             #346 <Class BitmapDrawable>
	//   21   39:dup             
	//   22   40:aload_1         
	//   23   41:invokevirtual   #352 <Method Resources Activity.getResources()>
	//   24   44:aload_2         
	//   25   45:invokespecial   #355 <Method void BitmapDrawable(Resources, android.graphics.Bitmap)>
	//   26   48:invokespecial   #357 <Method SplashConfig setLogo(Drawable)>
	//   27   51:pop             
		}
	//   28   52:return          
	}

	public boolean isHtmlSplash()
	{
		if(forceNative)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field boolean forceNative>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return htmlSplash;
	//    5    9:aload_0         
	//    6   10:getfield        #138 <Field boolean htmlSplash>
	//    7   13:ireturn         
	}

	boolean isUserDefinedSplash()
	{
		return getTheme() == Theme.USER_DEFINED || getCustomScreen() != -1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//    2    4:getstatic       #363 <Field SplashConfig$Theme SplashConfig$Theme.USER_DEFINED>
	//    3    7:if_acmpeq       18
	//    4   10:aload_0         
	//    5   11:invokevirtual   #286 <Method int getCustomScreen()>
	//    6   14:iconst_m1       
	//    7   15:icmpeq          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public SplashConfig setAppName(String s)
	{
		appName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field String appName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setCustomScreen(int j)
	{
		customScreen = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field int customScreen>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setDefaults(Context context)
	{
		SplashConfig splashconfig = f.b().a();
	//    0    0:invokestatic    #372 <Method com.startapp.android.publish.ads.splash.f f.b()>
	//    1    3:invokevirtual   #374 <Method SplashConfig f.a()>
	//    2    6:astore_2        
		if(splashconfig == null)
	//*   3    7:aload_2         
	//*   4    8:ifnonnull       142
			splashconfig = getDefaultSplashConfig();
	//    5   11:invokestatic    #152 <Method SplashConfig getDefaultSplashConfig()>
	//    6   14:astore_2        
		else
	//*   7   15:aload_2         
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #376 <Method void applyDefaultSplashConfig(SplashConfig, Context)>
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #184 <Method SplashConfig$MaxAdDisplayTime getMaxAdDisplayTime()>
	//*  12   24:ifnonnull       36
	//*  13   27:aload_0         
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #184 <Method SplashConfig$MaxAdDisplayTime getMaxAdDisplayTime()>
	//*  16   32:invokevirtual   #188 <Method SplashConfig setMaxAdDisplayTime(SplashConfig$MaxAdDisplayTime)>
	//*  17   35:pop             
	//*  18   36:aload_0         
	//*  19   37:invokevirtual   #172 <Method Long getMaxLoadAdTimeout()>
	//*  20   40:ifnonnull       55
	//*  21   43:aload_0         
	//*  22   44:aload_2         
	//*  23   45:invokevirtual   #172 <Method Long getMaxLoadAdTimeout()>
	//*  24   48:invokevirtual   #176 <Method long Long.longValue()>
	//*  25   51:invokevirtual   #180 <Method SplashConfig setMaxLoadAdTimeout(long)>
	//*  26   54:pop             
	//*  27   55:aload_0         
	//*  28   56:invokevirtual   #164 <Method SplashConfig$MinSplashTime getMinSplashTime()>
	//*  29   59:ifnonnull       71
	//*  30   62:aload_0         
	//*  31   63:aload_2         
	//*  32   64:invokevirtual   #164 <Method SplashConfig$MinSplashTime getMinSplashTime()>
	//*  33   67:invokevirtual   #168 <Method SplashConfig setMinSplashTime(SplashConfig$MinSplashTime)>
	//*  34   70:pop             
	//*  35   71:aload_0         
	//*  36   72:invokevirtual   #192 <Method SplashConfig$Orientation getOrientation()>
	//*  37   75:ifnonnull       87
	//*  38   78:aload_0         
	//*  39   79:aload_2         
	//*  40   80:invokevirtual   #192 <Method SplashConfig$Orientation getOrientation()>
	//*  41   83:invokevirtual   #196 <Method SplashConfig setOrientation(SplashConfig$Orientation)>
	//*  42   86:pop             
	//*  43   87:aload_0         
	//*  44   88:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//*  45   91:ifnonnull       103
	//*  46   94:aload_0         
	//*  47   95:aload_2         
	//*  48   96:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//*  49   99:invokevirtual   #160 <Method SplashConfig setTheme(SplashConfig$Theme)>
	//*  50  102:pop             
	//*  51  103:aload_0         
	//*  52  104:invokevirtual   #336 <Method int getLogoRes()>
	//*  53  107:iconst_m1       
	//*  54  108:icmpne          123
	//*  55  111:aload_0         
	//*  56  112:aload_1         
	//*  57  113:invokevirtual   #380 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  58  116:getfield        #385 <Field int ApplicationInfo.icon>
	//*  59  119:invokevirtual   #387 <Method SplashConfig setLogo(int)>
	//*  60  122:pop             
	//*  61  123:aload_0         
	//*  62  124:invokevirtual   #207 <Method String getAppName()>
	//*  63  127:ldc1            #31  <String "">
	//*  64  129:if_acmpne       141
	//*  65  132:aload_0         
	//*  66  133:aload_2         
	//*  67  134:invokevirtual   #207 <Method String getAppName()>
	//*  68  137:invokevirtual   #224 <Method SplashConfig setAppName(String)>
	//*  69  140:pop             
	//*  70  141:return          
			setHtmlSplash(splashconfig.isHtmlSplash());
	//   71  142:aload_0         
	//   72  143:aload_2         
	//   73  144:invokevirtual   #389 <Method boolean isHtmlSplash()>
	//   74  147:invokevirtual   #393 <Method SplashConfig setHtmlSplash(boolean)>
	//   75  150:pop             
		applyDefaultSplashConfig(splashconfig, context);
		if(getMaxAdDisplayTime() == null)
			setMaxAdDisplayTime(splashconfig.getMaxAdDisplayTime());
		if(getMaxLoadAdTimeout() == null)
			setMaxLoadAdTimeout(splashconfig.getMaxLoadAdTimeout().longValue());
		if(getMinSplashTime() == null)
			setMinSplashTime(splashconfig.getMinSplashTime());
		if(getOrientation() == null)
			setOrientation(splashconfig.getOrientation());
		if(getTheme() == null)
			setTheme(splashconfig.getTheme());
		if(getLogoRes() == -1)
			setLogo(context.getApplicationInfo().icon);
		if(getAppName() == "")
			setAppName(splashconfig.getAppName());
	//*  76  151:goto            15
	}

	protected SplashConfig setHtmlSplash(boolean flag)
	{
		htmlSplash = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field boolean htmlSplash>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setLoadingType(String s)
	{
		splashLoadingType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field String splashLoadingType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setLogo(int j)
	{
		logoRes = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #120 <Field int logoRes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setLogo(byte abyte0[])
	{
		logoByteArray = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #118 <Field byte[] logoByteArray>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setMaxAdDisplayTime(MaxAdDisplayTime maxaddisplaytime)
	{
		defaultMaxAdDisplayTime = maxaddisplaytime;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #134 <Field SplashConfig$MaxAdDisplayTime defaultMaxAdDisplayTime>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected SplashConfig setMaxLoadAdTimeout(long l)
	{
		defaultMaxLoadTime = Long.valueOf(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #130 <Method Long Long.valueOf(long)>
	//    3    5:putfield        #132 <Field Long defaultMaxLoadTime>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public SplashConfig setMinSplashTime(MinSplashTime minsplashtime)
	{
		defaultMinSplashTime = minsplashtime;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #124 <Field SplashConfig$MinSplashTime defaultMinSplashTime>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setOrientation(Orientation orientation)
	{
		defaultOrientation = orientation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field SplashConfig$Orientation defaultOrientation>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SplashConfig setTheme(Theme theme)
	{
		defaultTheme = theme;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field SplashConfig$Theme defaultTheme>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	protected boolean validate(Context context)
	{
		_cls1..SwitchMap.com.startapp.android.publish.ads.splash.SplashConfig.Theme[getTheme().ordinal()];
	//    0    0:getstatic       #235 <Field int[] SplashConfig$1.$SwitchMap$com$startapp$android$publish$ads$splash$SplashConfig$Theme>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #156 <Method SplashConfig$Theme getTheme()>
	//    3    7:invokevirtual   #239 <Method int SplashConfig$Theme.ordinal()>
	//    4   10:iaload          
		JVM INSTR tableswitch 7 7: default 28
	//	               7 106;
	//    5   11:tableswitch     7 7: default 28
	//	               7 106
		   goto _L1 _L2
_L1:
		if(getAppName().equals(""))
	//*   6   28:aload_0         
	//*   7   29:invokevirtual   #207 <Method String getAppName()>
	//*   8   32:ldc1            #31  <String "">
	//*   9   34:invokevirtual   #213 <Method boolean String.equals(Object)>
	//*  10   37:ifeq            51
			setAppName(c.a(context, "Welcome!"));
	//   11   40:aload_0         
	//   12   41:aload_1         
	//   13   42:ldc1            #215 <String "Welcome!">
	//   14   44:invokestatic    #221 <Method String c.a(Context, String)>
	//   15   47:invokevirtual   #224 <Method SplashConfig setAppName(String)>
	//   16   50:pop             
		if(getLogo() != null || getLogoByteArray() != null) goto _L4; else goto _L3
	//   17   51:aload_0         
	//   18   52:invokevirtual   #334 <Method Drawable getLogo()>
	//   19   55:ifnonnull       104
	//   20   58:aload_0         
	//   21   59:invokevirtual   #338 <Method byte[] getLogoByteArray()>
	//   22   62:ifnonnull       104
_L3:
		if(getLogoRes() != -1) goto _L6; else goto _L5
	//   23   65:aload_0         
	//   24   66:invokevirtual   #336 <Method int getLogoRes()>
	//   25   69:iconst_m1       
	//   26   70:icmpne          123
_L5:
		setLogo(context.getApplicationInfo().icon);
	//   27   73:aload_0         
	//   28   74:aload_1         
	//   29   75:invokevirtual   #380 <Method ApplicationInfo Context.getApplicationInfo()>
	//   30   78:getfield        #385 <Field int ApplicationInfo.icon>
	//   31   81:invokevirtual   #387 <Method SplashConfig setLogo(int)>
	//   32   84:pop             
		setLogo(context.getResources().getDrawable(context.getApplicationInfo().icon));
	//   33   85:aload_0         
	//   34   86:aload_1         
	//   35   87:invokevirtual   #397 <Method Resources Context.getResources()>
	//   36   90:aload_1         
	//   37   91:invokevirtual   #380 <Method ApplicationInfo Context.getApplicationInfo()>
	//   38   94:getfield        #385 <Field int ApplicationInfo.icon>
	//   39   97:invokevirtual   #403 <Method Drawable Resources.getDrawable(int)>
	//   40  100:invokespecial   #357 <Method SplashConfig setLogo(Drawable)>
	//   41  103:pop             
_L4:
		return true;
	//   42  104:iconst_1        
	//   43  105:ireturn         
_L2:
		if(getCustomScreen() != -1) goto _L4; else goto _L7
	//   44  106:aload_0         
	//   45  107:invokevirtual   #286 <Method int getCustomScreen()>
	//   46  110:iconst_m1       
	//   47  111:icmpne          104
_L7:
		setErrorMsg("StartApp: Exception getting custom screen resource id, make sure it is set");
	//   48  114:aload_0         
	//   49  115:ldc2            #405 <String "StartApp: Exception getting custom screen resource id, make sure it is set">
	//   50  118:invokespecial   #407 <Method void setErrorMsg(String)>
		return false;
	//   51  121:iconst_0        
	//   52  122:ireturn         
_L6:
		setLogo(context.getResources().getDrawable(getLogoRes()));
	//   53  123:aload_0         
	//   54  124:aload_1         
	//   55  125:invokevirtual   #397 <Method Resources Context.getResources()>
	//   56  128:aload_0         
	//   57  129:invokevirtual   #336 <Method int getLogoRes()>
	//   58  132:invokevirtual   #403 <Method Drawable Resources.getDrawable(int)>
	//   59  135:invokespecial   #357 <Method SplashConfig setLogo(Drawable)>
	//   60  138:pop             
		return true;
	//   61  139:iconst_1        
	//   62  140:ireturn         
	}

	private static long DEFAULT_MAX_LOAD = 0L;
	private static final int INT_EMPTY_VALUE = -1;
	private static final String STRING_EMPTY_VALUE = "";
	private static final String VALUE_DEFAULT_HTML_BG_COLOR = "#066CAA";
	private static final String VALUE_DEFAULT_HTML_FONT_COLOR = "ffffff";
	private static final String VALUE_DEFAULT_HTML_LOADING_TYPE = "LoadingDots";
	private static final boolean VALUE_DEFAULT_HTML_SPLASH = true;
	private static final MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY;
	private static final long VALUE_DEFAULT_MAXLOAD;
	private static final MinSplashTime VALUE_DEFAULT_MINSPLASHTIME;
	private static final Orientation VALUE_DEFAULT_ORIENTATION;
	private static final Theme VALUE_DEFAULT_THEME;
	private static final long serialVersionUID = 1L;
	private String appName;
	private int customScreen;
	private MaxAdDisplayTime defaultMaxAdDisplayTime;
	private Long defaultMaxLoadTime;
	private MinSplashTime defaultMinSplashTime;
	private Orientation defaultOrientation;
	private Theme defaultTheme;
	private transient String errMsg;
	private boolean forceNative;
	private boolean htmlSplash;
	private transient Drawable logo;
	private byte logoByteArray[];
	private int logoRes;
	private String splashBgColor;
	private String splashFontColor;
	private String splashLoadingType;

	static 
	{
		DEFAULT_MAX_LOAD = 7500L;
	//    0    0:ldc2w           #79  <Long 7500L>
	//    1    3:putstatic       #82  <Field long DEFAULT_MAX_LOAD>
		VALUE_DEFAULT_THEME = Theme.OCEAN;
	//    2    6:getstatic       #85  <Field SplashConfig$Theme SplashConfig$Theme.OCEAN>
	//    3    9:putstatic       #87  <Field SplashConfig$Theme VALUE_DEFAULT_THEME>
		VALUE_DEFAULT_MINSPLASHTIME = MinSplashTime.REGULAR;
	//    4   12:getstatic       #90  <Field SplashConfig$MinSplashTime SplashConfig$MinSplashTime.REGULAR>
	//    5   15:putstatic       #92  <Field SplashConfig$MinSplashTime VALUE_DEFAULT_MINSPLASHTIME>
		VALUE_DEFAULT_MAXLOAD = DEFAULT_MAX_LOAD;
	//    6   18:getstatic       #82  <Field long DEFAULT_MAX_LOAD>
	//    7   21:putstatic       #94  <Field long VALUE_DEFAULT_MAXLOAD>
		VALUE_DEFAULT_MAXADDISPLAY = MaxAdDisplayTime.FOR_EVER;
	//    8   24:getstatic       #97  <Field SplashConfig$MaxAdDisplayTime SplashConfig$MaxAdDisplayTime.FOR_EVER>
	//    9   27:putstatic       #99  <Field SplashConfig$MaxAdDisplayTime VALUE_DEFAULT_MAXADDISPLAY>
		VALUE_DEFAULT_ORIENTATION = Orientation.AUTO;
	//   10   30:getstatic       #102 <Field SplashConfig$Orientation SplashConfig$Orientation.AUTO>
	//   11   33:putstatic       #104 <Field SplashConfig$Orientation VALUE_DEFAULT_ORIENTATION>
	//*  12   36:return          
	}
}
