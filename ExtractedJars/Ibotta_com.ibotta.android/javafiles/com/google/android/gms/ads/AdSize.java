// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ads.*;

public final class AdSize
{

	public AdSize(int i, int j)
	{
		String s;
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          11
			s = "FULL";
	//    3    5:ldc1            #75  <String "FULL">
	//    4    7:astore_3        
		else
	//*   5    8:goto            16
			s = String.valueOf(i);
	//    6   11:iload_1         
	//    7   12:invokestatic    #81  <Method String String.valueOf(int)>
	//    8   15:astore_3        
		String s1;
		if(j == -2)
	//*   9   16:iload_2         
	//*  10   17:bipush          -2
	//*  11   19:icmpne          29
			s1 = "AUTO";
	//   12   22:ldc1            #83  <String "AUTO">
	//   13   24:astore          4
		else
	//*  14   26:goto            35
			s1 = String.valueOf(j);
	//   15   29:iload_2         
	//   16   30:invokestatic    #81  <Method String String.valueOf(int)>
	//   17   33:astore          4
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 4 + String.valueOf(((Object) (s1))).length());
	//   18   35:new             #85  <Class StringBuilder>
	//   19   38:dup             
	//   20   39:aload_3         
	//   21   40:invokestatic    #88  <Method String String.valueOf(Object)>
	//   22   43:invokevirtual   #92  <Method int String.length()>
	//   23   46:iconst_4        
	//   24   47:iadd            
	//   25   48:aload           4
	//   26   50:invokestatic    #88  <Method String String.valueOf(Object)>
	//   27   53:invokevirtual   #92  <Method int String.length()>
	//   28   56:iadd            
	//   29   57:invokespecial   #95  <Method void StringBuilder(int)>
	//   30   60:astore          5
		stringbuilder.append(s);
	//   31   62:aload           5
	//   32   64:aload_3         
	//   33   65:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		stringbuilder.append("x");
	//   35   69:aload           5
	//   36   71:ldc1            #101 <String "x">
	//   37   73:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   38   76:pop             
		stringbuilder.append(s1);
	//   39   77:aload           5
	//   40   79:aload           4
	//   41   81:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   42   84:pop             
		stringbuilder.append("_as");
	//   43   85:aload           5
	//   44   87:ldc1            #103 <String "_as">
	//   45   89:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
		this(i, j, stringbuilder.toString());
	//   47   93:aload_0         
	//   48   94:iload_1         
	//   49   95:iload_2         
	//   50   96:aload           5
	//   51   98:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   52  101:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   53  104:return          
	}

	AdSize(int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #109 <Method void Object()>
		if(i < 0 && i != -1 && i != -3)
	//*   2    4:iload_1         
	//*   3    5:ifge            57
	//*   4    8:iload_1         
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          57
	//*   7   13:iload_1         
	//*   8   14:bipush          -3
	//*   9   16:icmpne          22
	//*  10   19:goto            57
		{
			s = ((String) (new StringBuilder(37)));
	//   11   22:new             #85  <Class StringBuilder>
	//   12   25:dup             
	//   13   26:bipush          37
	//   14   28:invokespecial   #95  <Method void StringBuilder(int)>
	//   15   31:astore_3        
			((StringBuilder) (s)).append("Invalid width for AdSize: ");
	//   16   32:aload_3         
	//   17   33:ldc1            #111 <String "Invalid width for AdSize: ">
	//   18   35:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (s)).append(i);
	//   20   39:aload_3         
	//   21   40:iload_1         
	//   22   41:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   23   44:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   24   45:new             #116 <Class IllegalArgumentException>
	//   25   48:dup             
	//   26   49:aload_3         
	//   27   50:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #119 <Method void IllegalArgumentException(String)>
	//   29   56:athrow          
		}
		if(j < 0 && j != -2 && j != -4)
	//*  30   57:iload_2         
	//*  31   58:ifge            111
	//*  32   61:iload_2         
	//*  33   62:bipush          -2
	//*  34   64:icmpeq          111
	//*  35   67:iload_2         
	//*  36   68:bipush          -4
	//*  37   70:icmpne          76
	//*  38   73:goto            111
		{
			s = ((String) (new StringBuilder(38)));
	//   39   76:new             #85  <Class StringBuilder>
	//   40   79:dup             
	//   41   80:bipush          38
	//   42   82:invokespecial   #95  <Method void StringBuilder(int)>
	//   43   85:astore_3        
			((StringBuilder) (s)).append("Invalid height for AdSize: ");
	//   44   86:aload_3         
	//   45   87:ldc1            #121 <String "Invalid height for AdSize: ">
	//   46   89:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			((StringBuilder) (s)).append(j);
	//   48   93:aload_3         
	//   49   94:iload_2         
	//   50   95:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   51   98:pop             
			throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   52   99:new             #116 <Class IllegalArgumentException>
	//   53  102:dup             
	//   54  103:aload_3         
	//   55  104:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   56  107:invokespecial   #119 <Method void IllegalArgumentException(String)>
	//   57  110:athrow          
		} else
		{
			zzuq = i;
	//   58  111:aload_0         
	//   59  112:iload_1         
	//   60  113:putfield        #123 <Field int zzuq>
			zzur = j;
	//   61  116:aload_0         
	//   62  117:iload_2         
	//   63  118:putfield        #125 <Field int zzur>
			zzus = s;
	//   64  121:aload_0         
	//   65  122:aload_3         
	//   66  123:putfield        #127 <Field String zzus>
			return;
	//   67  126:return          
		}
	}

	public final boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof AdSize))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AdSize>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((AdSize)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class AdSize>
	//   12   20:astore_1        
		return zzuq == ((AdSize) (obj)).zzuq && zzur == ((AdSize) (obj)).zzur && zzus.equals(((Object) (((AdSize) (obj)).zzus)));
	//   13   21:aload_0         
	//   14   22:getfield        #123 <Field int zzuq>
	//   15   25:aload_1         
	//   16   26:getfield        #123 <Field int zzuq>
	//   17   29:icmpne          59
	//   18   32:aload_0         
	//   19   33:getfield        #125 <Field int zzur>
	//   20   36:aload_1         
	//   21   37:getfield        #125 <Field int zzur>
	//   22   40:icmpne          59
	//   23   43:aload_0         
	//   24   44:getfield        #127 <Field String zzus>
	//   25   47:aload_1         
	//   26   48:getfield        #127 <Field String zzus>
	//   27   51:invokevirtual   #131 <Method boolean String.equals(Object)>
	//   28   54:ifeq            59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
	}

	public final int getHeight()
	{
		return zzur;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int zzur>
	//    2    4:ireturn         
	}

	public final int getHeightInPixels(Context context)
	{
		switch(zzur)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field int zzur>
		{
	//*   2    4:tableswitch     -4 -2: default 32
	//	               -4 56
	//	               -3 56
	//	               -2 45
		default:
			zzkb.zzif();
	//    3   32:invokestatic    #140 <Method zzamu zzkb.zzif()>
	//    4   35:pop             
			return zzamu.zza(context, zzur);
	//    5   36:aload_1         
	//    6   37:aload_0         
	//    7   38:getfield        #125 <Field int zzur>
	//    8   41:invokestatic    #146 <Method int zzamu.zza(Context, int)>
	//    9   44:ireturn         

		case -2: 
			return zzjn.zzc(context.getResources().getDisplayMetrics());
	//   10   45:aload_1         
	//   11   46:invokevirtual   #152 <Method Resources Context.getResources()>
	//   12   49:invokevirtual   #158 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   13   52:invokestatic    #164 <Method int zzjn.zzc(android.util.DisplayMetrics)>
	//   14   55:ireturn         

		case -4: 
		case -3: 
			return -1;
	//   15   56:iconst_m1       
	//   16   57:ireturn         
		}
	}

	public final int getWidth()
	{
		return zzuq;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int zzuq>
	//    2    4:ireturn         
	}

	public final int getWidthInPixels(Context context)
	{
		int i = zzuq;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int zzuq>
	//    2    4:istore_2        
		if(i != -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          47
			switch(i)
	//*   6   10:iload_2         
			{
	//*   7   11:tableswitch     -4 -3: default 32
	//	               -4 45
	//	               -3 45
			default:
				zzkb.zzif();
	//    8   32:invokestatic    #140 <Method zzamu zzkb.zzif()>
	//    9   35:pop             
				return zzamu.zza(context, zzuq);
	//   10   36:aload_1         
	//   11   37:aload_0         
	//   12   38:getfield        #123 <Field int zzuq>
	//   13   41:invokestatic    #146 <Method int zzamu.zza(Context, int)>
	//   14   44:ireturn         

			case -4: 
			case -3: 
				return -1;
	//   15   45:iconst_m1       
	//   16   46:ireturn         
			}
		else
			return zzjn.zzb(context.getResources().getDisplayMetrics());
	//   17   47:aload_1         
	//   18   48:invokevirtual   #152 <Method Resources Context.getResources()>
	//   19   51:invokevirtual   #158 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   20   54:invokestatic    #169 <Method int zzjn.zzb(android.util.DisplayMetrics)>
	//   21   57:ireturn         
	}

	public final int hashCode()
	{
		return zzus.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String zzus>
	//    2    4:invokevirtual   #172 <Method int String.hashCode()>
	//    3    7:ireturn         
	}

	public final boolean isAutoHeight()
	{
		return zzur == -2;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int zzur>
	//    2    4:bipush          -2
	//    3    6:icmpne          11
	//    4    9:iconst_1        
	//    5   10:ireturn         
	//    6   11:iconst_0        
	//    7   12:ireturn         
	}

	public final boolean isFluid()
	{
		return zzuq == -3 && zzur == -4;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int zzuq>
	//    2    4:bipush          -3
	//    3    6:icmpne          20
	//    4    9:aload_0         
	//    5   10:getfield        #125 <Field int zzur>
	//    6   13:bipush          -4
	//    7   15:icmpne          20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public final boolean isFullWidth()
	{
		return zzuq == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int zzuq>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public final String toString()
	{
		return zzus;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String zzus>
	//    2    4:areturn         
	}

	public static final int AUTO_HEIGHT = -2;
	public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
	public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
	public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
	public static final int FULL_WIDTH = -1;
	public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
	public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
	public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
	public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");
	public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
	public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
	public static final AdSize zzup = new AdSize(50, 50, "50x50_mb");
	private final int zzuq;
	private final int zzur;
	private final String zzus;

	static 
	{
	//    0    0:new             #2   <Class AdSize>
	//    1    3:dup             
	//    2    4:sipush          320
	//    3    7:bipush          50
	//    4    9:ldc1            #29  <String "320x50_mb">
	//    5   11:invokespecial   #33  <Method void AdSize(int, int, String)>
	//    6   14:putstatic       #35  <Field AdSize BANNER>
	//    7   17:new             #2   <Class AdSize>
	//    8   20:dup             
	//    9   21:sipush          468
	//   10   24:bipush          60
	//   11   26:ldc1            #37  <String "468x60_as">
	//   12   28:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   13   31:putstatic       #39  <Field AdSize FULL_BANNER>
	//   14   34:new             #2   <Class AdSize>
	//   15   37:dup             
	//   16   38:sipush          320
	//   17   41:bipush          100
	//   18   43:ldc1            #41  <String "320x100_as">
	//   19   45:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   20   48:putstatic       #43  <Field AdSize LARGE_BANNER>
	//   21   51:new             #2   <Class AdSize>
	//   22   54:dup             
	//   23   55:sipush          728
	//   24   58:bipush          90
	//   25   60:ldc1            #45  <String "728x90_as">
	//   26   62:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   27   65:putstatic       #47  <Field AdSize LEADERBOARD>
	//   28   68:new             #2   <Class AdSize>
	//   29   71:dup             
	//   30   72:sipush          300
	//   31   75:sipush          250
	//   32   78:ldc1            #49  <String "300x250_as">
	//   33   80:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   34   83:putstatic       #51  <Field AdSize MEDIUM_RECTANGLE>
	//   35   86:new             #2   <Class AdSize>
	//   36   89:dup             
	//   37   90:sipush          160
	//   38   93:sipush          600
	//   39   96:ldc1            #53  <String "160x600_as">
	//   40   98:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   41  101:putstatic       #55  <Field AdSize WIDE_SKYSCRAPER>
	//   42  104:new             #2   <Class AdSize>
	//   43  107:dup             
	//   44  108:iconst_m1       
	//   45  109:bipush          -2
	//   46  111:ldc1            #57  <String "smart_banner">
	//   47  113:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   48  116:putstatic       #59  <Field AdSize SMART_BANNER>
	//   49  119:new             #2   <Class AdSize>
	//   50  122:dup             
	//   51  123:bipush          -3
	//   52  125:bipush          -4
	//   53  127:ldc1            #61  <String "fluid">
	//   54  129:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   55  132:putstatic       #63  <Field AdSize FLUID>
	//   56  135:new             #2   <Class AdSize>
	//   57  138:dup             
	//   58  139:bipush          50
	//   59  141:bipush          50
	//   60  143:ldc1            #65  <String "50x50_mb">
	//   61  145:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   62  148:putstatic       #67  <Field AdSize zzup>
	//   63  151:new             #2   <Class AdSize>
	//   64  154:dup             
	//   65  155:bipush          -3
	//   66  157:iconst_0        
	//   67  158:ldc1            #69  <String "search_v2">
	//   68  160:invokespecial   #33  <Method void AdSize(int, int, String)>
	//   69  163:putstatic       #71  <Field AdSize SEARCH>
	//*  70  166:return          
	}
}
