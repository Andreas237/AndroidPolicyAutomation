// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import com.appscend.media.APSMediaPlayer;
import java.io.File;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.appscend.utilities:
//			Constants

public class VPUtilities
{

	public VPUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int androidStatusBar(int i)
	{
		int j;
label0:
		{
			if(!Constants.statusBarDefaultState)
	//*   0    0:getstatic       #17  <Field boolean Constants.statusBarDefaultState>
	//*   1    3:ifne            25
			{
				j = i;
	//    2    6:iload_0         
	//    3    7:istore_1        
				if(!Constants.deviceIsTablet)
					break label0;
	//    4    8:getstatic       #20  <Field boolean Constants.deviceIsTablet>
	//    5   11:ifeq            31
				j = i;
	//    6   14:iload_0         
	//    7   15:istore_1        
				if(Constants.statusBarHeight != Constants.navigationBarHeight)
					break label0;
	//    8   16:getstatic       #24  <Field int Constants.statusBarHeight>
	//    9   19:getstatic       #27  <Field int Constants.navigationBarHeight>
	//   10   22:icmpne          31
			}
			j = i - Constants.statusBarHeight;
	//   11   25:iload_0         
	//   12   26:getstatic       #24  <Field int Constants.statusBarHeight>
	//   13   29:isub            
	//   14   30:istore_1        
		}
		return j;
	//   15   31:iload_1         
	//   16   32:ireturn         
	}

	public static ArrayList arrayValuesToURLs(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #31  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void ArrayList()>
	//    3    7:astore_1        
		arraylist = ((ArrayList) (arraylist.iterator()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #36  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_0        
		do
		{
			if(!((Iterator) (arraylist)).hasNext())
				break;
	//    7   13:aload_0         
	//    8   14:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            52
			Object obj = ((Iterator) (arraylist)).next();
	//   10   22:aload_0         
	//   11   23:invokeinterface #46  <Method Object Iterator.next()>
	//   12   28:astore_2        
			if(obj != null && (obj instanceof String))
	//*  13   29:aload_2         
	//*  14   30:ifnull          13
	//*  15   33:aload_2         
	//*  16   34:instanceof      #48  <Class String>
	//*  17   37:ifeq            13
				arraylist1.add(((Object) ((String)obj)));
	//   18   40:aload_1         
	//   19   41:aload_2         
	//   20   42:checkcast       #48  <Class String>
	//   21   45:invokevirtual   #52  <Method boolean ArrayList.add(Object)>
	//   22   48:pop             
		} while(true);
	//   23   49:goto            13
		return arraylist1;
	//   24   52:aload_1         
	//   25   53:areturn         
	}

	public static boolean currentOrientationIsLandscape()
	{
		return getHeight() < getWidth();
	//    0    0:invokestatic    #59  <Method int getHeight()>
	//    1    3:invokestatic    #62  <Method int getWidth()>
	//    2    6:icmpge          11
	//    3    9:iconst_1        
	//    4   10:ireturn         
	//    5   11:iconst_0        
	//    6   12:ireturn         
	}

	public static boolean findBinary(String s)
	{
		String as[] = new String[8];
	//    0    0:bipush          8
	//    1    2:anewarray       String[]
	//    2    5:astore_3        
		as[0] = "/sbin/";
	//    3    6:aload_3         
	//    4    7:iconst_0        
	//    5    8:ldc1            #66  <String "/sbin/">
	//    6   10:aastore         
		as[1] = "/system/bin/";
	//    7   11:aload_3         
	//    8   12:iconst_1        
	//    9   13:ldc1            #68  <String "/system/bin/">
	//   10   15:aastore         
		as[2] = "/system/xbin/";
	//   11   16:aload_3         
	//   12   17:iconst_2        
	//   13   18:ldc1            #70  <String "/system/xbin/">
	//   14   20:aastore         
		as[3] = "/data/local/xbin/";
	//   15   21:aload_3         
	//   16   22:iconst_3        
	//   17   23:ldc1            #72  <String "/data/local/xbin/">
	//   18   25:aastore         
		as[4] = "/data/local/bin/";
	//   19   26:aload_3         
	//   20   27:iconst_4        
	//   21   28:ldc1            #74  <String "/data/local/bin/">
	//   22   30:aastore         
		as[5] = "/system/sd/xbin/";
	//   23   31:aload_3         
	//   24   32:iconst_5        
	//   25   33:ldc1            #76  <String "/system/sd/xbin/">
	//   26   35:aastore         
		as[6] = "/system/bin/failsafe/";
	//   27   36:aload_3         
	//   28   37:bipush          6
	//   29   39:ldc1            #78  <String "/system/bin/failsafe/">
	//   30   41:aastore         
		as[7] = "/data/local/";
	//   31   42:aload_3         
	//   32   43:bipush          7
	//   33   45:ldc1            #80  <String "/data/local/">
	//   34   47:aastore         
		int j = as.length;
	//   35   48:aload_3         
	//   36   49:arraylength     
	//   37   50:istore_2        
		for(int i = 0; i < j; i++)
	//*  38   51:iconst_0        
	//*  39   52:istore_1        
	//*  40   53:iload_1         
	//*  41   54:iload_2         
	//*  42   55:icmpge          114
		{
			String s1 = as[i];
	//   43   58:aload_3         
	//   44   59:iload_1         
	//   45   60:aaload          
	//   46   61:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   47   63:new             #82  <Class StringBuilder>
	//   48   66:dup             
	//   49   67:invokespecial   #83  <Method void StringBuilder()>
	//   50   70:astore          5
			stringbuilder.append(s1);
	//   51   72:aload           5
	//   52   74:aload           4
	//   53   76:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   54   79:pop             
			stringbuilder.append(s);
	//   55   80:aload           5
	//   56   82:aload_0         
	//   57   83:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   58   86:pop             
			if((new File(stringbuilder.toString())).exists())
	//*  59   87:new             #89  <Class File>
	//*  60   90:dup             
	//*  61   91:aload           5
	//*  62   93:invokevirtual   #93  <Method String StringBuilder.toString()>
	//*  63   96:invokespecial   #96  <Method void File(String)>
	//*  64   99:invokevirtual   #99  <Method boolean File.exists()>
	//*  65  102:ifeq            107
				return true;
	//   66  105:iconst_1        
	//   67  106:ireturn         
		}

	//   68  107:iload_1         
	//   69  108:iconst_1        
	//   70  109:iadd            
	//   71  110:istore_1        
	//*  72  111:goto            53
		return false;
	//   73  114:iconst_0        
	//   74  115:ireturn         
	}

	public static int getColorFromString(String s)
	{
		if(s.equals("transparent"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #105 <String "transparent">
	//*   2    3:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
			return 0;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		if(s.length() < 6)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #111 <Method int String.length()>
	//*   8   15:bipush          6
	//*   9   17:icmpge          23
			return 0xff000000;
	//   10   20:ldc1            #112 <Int 0xff000000>
	//   11   22:ireturn         
		if(s.length() <= 6)
			break MISSING_BLOCK_LABEL_112;
	//   12   23:aload_0         
	//   13   24:invokevirtual   #111 <Method int String.length()>
	//   14   27:bipush          6
	//   15   29:icmple          112
		if(s.length() == 7)
	//*  16   32:aload_0         
	//*  17   33:invokevirtual   #111 <Method int String.length()>
	//*  18   36:bipush          7
	//*  19   38:icmpne          46
			return Color.parseColor(s);
	//   20   41:aload_0         
	//   21   42:invokestatic    #117 <Method int Color.parseColor(String)>
	//   22   45:ireturn         
		if(s.substring(6, 8).equals("00"))
	//*  23   46:aload_0         
	//*  24   47:bipush          6
	//*  25   49:bipush          8
	//*  26   51:invokevirtual   #121 <Method String String.substring(int, int)>
	//*  27   54:ldc1            #123 <String "00">
	//*  28   56:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*  29   59:ifeq            64
			return 0;
	//   30   62:iconst_0        
	//   31   63:ireturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #82  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #83  <Method void StringBuilder()>
	//   35   71:astore_2        
		stringbuilder.append("#");
	//   36   72:aload_2         
	//   37   73:ldc1            #125 <String "#">
	//   38   75:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		stringbuilder.append(s.substring(6, 8));
	//   40   79:aload_2         
	//   41   80:aload_0         
	//   42   81:bipush          6
	//   43   83:bipush          8
	//   44   85:invokevirtual   #121 <Method String String.substring(int, int)>
	//   45   88:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
		stringbuilder.append(s.substring(0, 6));
	//   47   92:aload_2         
	//   48   93:aload_0         
	//   49   94:iconst_0        
	//   50   95:bipush          6
	//   51   97:invokevirtual   #121 <Method String String.substring(int, int)>
	//   52  100:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
		return Color.parseColor(stringbuilder.toString());
	//   54  104:aload_2         
	//   55  105:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   56  108:invokestatic    #117 <Method int Color.parseColor(String)>
	//   57  111:ireturn         
		int i;
		StringBuilder stringbuilder1 = new StringBuilder();
	//   58  112:new             #82  <Class StringBuilder>
	//   59  115:dup             
	//   60  116:invokespecial   #83  <Method void StringBuilder()>
	//   61  119:astore_2        
		stringbuilder1.append("#");
	//   62  120:aload_2         
	//   63  121:ldc1            #125 <String "#">
	//   64  123:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
		stringbuilder1.append(s);
	//   66  127:aload_2         
	//   67  128:aload_0         
	//   68  129:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   69  132:pop             
		i = Color.parseColor(stringbuilder1.toString());
	//   70  133:aload_2         
	//   71  134:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   72  137:invokestatic    #117 <Method int Color.parseColor(String)>
	//   73  140:istore_1        
		return i;
	//   74  141:iload_1         
	//   75  142:ireturn         
		s;
	//   76  143:astore_0        
		return 0;
	//   77  144:iconst_0        
	//   78  145:ireturn         
	}

	public static int getHeight()
	{
		Exception exception;
		if(Constants.display == null)
	//*   0    0:getstatic       #132 <Field Display Constants.display>
	//*   1    3:ifnonnull       8
			return 0;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		if(android.os.Build.VERSION.SDK_INT > 12)
	//*   4    8:getstatic       #137 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          12
	//*   6   13:icmple          96
		{
			Point point = new Point();
	//    7   16:new             #139 <Class Point>
	//    8   19:dup             
	//    9   20:invokespecial   #140 <Method void Point()>
	//   10   23:astore_1        
			Constants.display.getSize(point);
	//   11   24:getstatic       #132 <Field Display Constants.display>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #146 <Method void Display.getSize(Point)>
			int i;
			try
			{
				DisplayMetrics displaymetrics = new DisplayMetrics();
	//   14   31:new             #148 <Class DisplayMetrics>
	//   15   34:dup             
	//   16   35:invokespecial   #149 <Method void DisplayMetrics()>
	//   17   38:astore_2        
				((Class) (android/view/Display)).getMethod("getRealMetrics", new Class[] {
					android/util/DisplayMetrics
				}).invoke(((Object) (Constants.display)), new Object[] {
					displaymetrics
				});
	//   18   39:ldc1            #142 <Class Display>
	//   19   41:ldc1            #151 <String "getRealMetrics">
	//   20   43:iconst_1        
	//   21   44:anewarray       Class[]
	//   22   47:dup             
	//   23   48:iconst_0        
	//   24   49:ldc1            #148 <Class DisplayMetrics>
	//   25   51:aastore         
	//   26   52:invokevirtual   #157 <Method Method Class.getMethod(String, Class[])>
	//   27   55:getstatic       #132 <Field Display Constants.display>
	//   28   58:iconst_1        
	//   29   59:anewarray       Object[]
	//   30   62:dup             
	//   31   63:iconst_0        
	//   32   64:aload_2         
	//   33   65:aastore         
	//   34   66:invokevirtual   #163 <Method Object Method.invoke(Object, Object[])>
	//   35   69:pop             
				if(Constants.statusBarHeight == Constants.navigationBarHeight)
	//*  36   70:getstatic       #24  <Field int Constants.statusBarHeight>
	//*  37   73:getstatic       #27  <Field int Constants.navigationBarHeight>
	//*  38   76:icmpne          84
					return displaymetrics.heightPixels;
	//   39   79:aload_2         
	//   40   80:getfield        #166 <Field int DisplayMetrics.heightPixels>
	//   41   83:ireturn         
				i = point.y;
	//   42   84:aload_1         
	//   43   85:getfield        #169 <Field int Point.y>
	//   44   88:istore_0        
			}
	//*  45   89:iload_0         
	//*  46   90:ireturn         
	//*  47   91:aload_1         
	//*  48   92:getfield        #169 <Field int Point.y>
	//*  49   95:ireturn         
	//*  50   96:getstatic       #132 <Field Display Constants.display>
	//*  51   99:invokevirtual   #170 <Method int Display.getHeight()>
	//*  52  102:ireturn         
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				return point.y;
			}
			return i;
		} else
		{
			return Constants.display.getHeight();
		}
	//*  53  103:astore_2        
	//*  54  104:goto            91
	}

	public static int getWidth()
	{
		if(Constants.display == null)
	//*   0    0:getstatic       #132 <Field Display Constants.display>
	//*   1    3:ifnonnull       8
			return 0;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		if(android.os.Build.VERSION.SDK_INT > 12)
	//*   4    8:getstatic       #137 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          12
	//*   6   13:icmple          36
		{
			Point point = new Point();
	//    7   16:new             #139 <Class Point>
	//    8   19:dup             
	//    9   20:invokespecial   #140 <Method void Point()>
	//   10   23:astore_0        
			Constants.display.getSize(point);
	//   11   24:getstatic       #132 <Field Display Constants.display>
	//   12   27:aload_0         
	//   13   28:invokevirtual   #146 <Method void Display.getSize(Point)>
			return point.x;
	//   14   31:aload_0         
	//   15   32:getfield        #174 <Field int Point.x>
	//   16   35:ireturn         
		} else
		{
			return Constants.display.getWidth();
	//   17   36:getstatic       #132 <Field Display Constants.display>
	//   18   39:invokevirtual   #175 <Method int Display.getWidth()>
	//   19   42:ireturn         
		}
	}

	public static HashMap hashmapValuesToURLs(HashMap hashmap)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #179 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #180 <Method void HashMap()>
	//    3    7:astore_1        
		hashmap = ((HashMap) (hashmap.entrySet().iterator()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #184 <Method Set HashMap.entrySet()>
	//    6   12:invokeinterface #187 <Method Iterator Set.iterator()>
	//    7   17:astore_0        
		do
		{
			if(!((Iterator) (hashmap)).hasNext())
				break;
	//    8   18:aload_0         
	//    9   19:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            75
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (hashmap)).next();
	//   11   27:aload_0         
	//   12   28:invokeinterface #46  <Method Object Iterator.next()>
	//   13   33:checkcast       #189 <Class java.util.Map$Entry>
	//   14   36:astore_2        
			if(entry.getValue() instanceof ArrayList)
	//*  15   37:aload_2         
	//*  16   38:invokeinterface #192 <Method Object java.util.Map$Entry.getValue()>
	//*  17   43:instanceof      #31  <Class ArrayList>
	//*  18   46:ifeq            18
				hashmap1.put(entry.getKey(), ((Object) (arrayValuesToURLs((ArrayList)entry.getValue()))));
	//   19   49:aload_1         
	//   20   50:aload_2         
	//   21   51:invokeinterface #195 <Method Object java.util.Map$Entry.getKey()>
	//   22   56:aload_2         
	//   23   57:invokeinterface #192 <Method Object java.util.Map$Entry.getValue()>
	//   24   62:checkcast       #31  <Class ArrayList>
	//   25   65:invokestatic    #197 <Method ArrayList arrayValuesToURLs(ArrayList)>
	//   26   68:invokevirtual   #201 <Method Object HashMap.put(Object, Object)>
	//   27   71:pop             
		} while(true);
	//   28   72:goto            18
		return hashmap1;
	//   29   75:aload_1         
	//   30   76:areturn         
	}

	public static int iPhoneXToAndroid(int i)
	{
		float f1 = APSMediaPlayer.getInstance().getActivity().getResources().getDisplayMetrics().density;
	//    0    0:invokestatic    #209 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #213 <Method Activity APSMediaPlayer.getActivity()>
	//    2    6:invokevirtual   #219 <Method Resources Activity.getResources()>
	//    3    9:invokevirtual   #225 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   12:getfield        #229 <Field float DisplayMetrics.density>
	//    5   15:fstore_2        
		float f = f1;
	//    6   16:fload_2         
	//    7   17:fstore_1        
		if(f1 > 1.35F)
	//*   8   18:fload_2         
	//*   9   19:ldc1            #230 <Float 1.35F>
	//*  10   21:fcmpl           
	//*  11   22:ifle            27
			f = 1.0F;
	//   12   25:fconst_1        
	//   13   26:fstore_1        
		f1 = i;
	//   14   27:iload_0         
	//   15   28:i2f             
	//   16   29:fstore_2        
		float f2 = getWidth();
	//   17   30:invokestatic    #62  <Method int getWidth()>
	//   18   33:i2f             
	//   19   34:fstore_3        
		if(currentOrientationIsLandscape())
	//*  20   35:invokestatic    #232 <Method boolean currentOrientationIsLandscape()>
	//*  21   38:ifeq            61
		{
			if(Constants.deviceIsTablet)
	//*  22   41:getstatic       #20  <Field boolean Constants.deviceIsTablet>
	//*  23   44:ifeq            54
				i = 1024;
	//   24   47:sipush          1024
	//   25   50:istore_0        
			else
	//*  26   51:goto            78
				i = 480;
	//   27   54:sipush          480
	//   28   57:istore_0        
		} else
	//*  29   58:goto            78
		if(Constants.deviceIsTablet)
	//*  30   61:getstatic       #20  <Field boolean Constants.deviceIsTablet>
	//*  31   64:ifeq            74
			i = 768;
	//   32   67:sipush          768
	//   33   70:istore_0        
		else
	//*  34   71:goto            78
			i = 320;
	//   35   74:sipush          320
	//   36   77:istore_0        
		return Math.round((f1 * f * f2) / (float)i);
	//   37   78:fload_2         
	//   38   79:fload_1         
	//   39   80:fmul            
	//   40   81:fload_3         
	//   41   82:fmul            
	//   42   83:iload_0         
	//   43   84:i2f             
	//   44   85:fdiv            
	//   45   86:invokestatic    #238 <Method int Math.round(float)>
	//   46   89:ireturn         
	}

	public static int iPhoneYToAndroid(int i)
	{
		float f1 = APSMediaPlayer.getInstance().getActivity().getResources().getDisplayMetrics().density;
	//    0    0:invokestatic    #209 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #213 <Method Activity APSMediaPlayer.getActivity()>
	//    2    6:invokevirtual   #219 <Method Resources Activity.getResources()>
	//    3    9:invokevirtual   #225 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   12:getfield        #229 <Field float DisplayMetrics.density>
	//    5   15:fstore_2        
		float f = f1;
	//    6   16:fload_2         
	//    7   17:fstore_1        
		if(f1 > 1.35F)
	//*   8   18:fload_2         
	//*   9   19:ldc1            #230 <Float 1.35F>
	//*  10   21:fcmpl           
	//*  11   22:ifle            27
			f = 1.0F;
	//   12   25:fconst_1        
	//   13   26:fstore_1        
		f1 = i;
	//   14   27:iload_0         
	//   15   28:i2f             
	//   16   29:fstore_2        
		float f2 = androidStatusBar(getHeight());
	//   17   30:invokestatic    #59  <Method int getHeight()>
	//   18   33:invokestatic    #241 <Method int androidStatusBar(int)>
	//   19   36:i2f             
	//   20   37:fstore_3        
		if(currentOrientationIsLandscape())
	//*  21   38:invokestatic    #232 <Method boolean currentOrientationIsLandscape()>
	//*  22   41:ifeq            69
		{
			if(Constants.deviceIsTablet)
	//*  23   44:getstatic       #20  <Field boolean Constants.deviceIsTablet>
	//*  24   47:ifeq            57
				i = 768;
	//   25   50:sipush          768
	//   26   53:istore_0        
			else
	//*  27   54:goto            61
				i = 320;
	//   28   57:sipush          320
	//   29   60:istore_0        
			i = iphoneStatusBar(i);
	//   30   61:iload_0         
	//   31   62:invokestatic    #244 <Method int iphoneStatusBar(int)>
	//   32   65:istore_0        
		} else
	//*  33   66:goto            91
		{
			if(Constants.deviceIsTablet)
	//*  34   69:getstatic       #20  <Field boolean Constants.deviceIsTablet>
	//*  35   72:ifeq            82
				i = 1024;
	//   36   75:sipush          1024
	//   37   78:istore_0        
			else
	//*  38   79:goto            86
				i = 480;
	//   39   82:sipush          480
	//   40   85:istore_0        
			i = iphoneStatusBar(i);
	//   41   86:iload_0         
	//   42   87:invokestatic    #244 <Method int iphoneStatusBar(int)>
	//   43   90:istore_0        
		}
		return Math.round((f1 * f * f2) / (float)i);
	//   44   91:fload_2         
	//   45   92:fload_1         
	//   46   93:fmul            
	//   47   94:fload_3         
	//   48   95:fmul            
	//   49   96:iload_0         
	//   50   97:i2f             
	//   51   98:fdiv            
	//   52   99:invokestatic    #238 <Method int Math.round(float)>
	//   53  102:ireturn         
	}

	public static int iphoneStatusBar(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(Constants.statusBarDefaultState)
	//*   2    2:getstatic       #17  <Field boolean Constants.statusBarDefaultState>
	//*   3    5:ifeq            13
			j = i - 20;
	//    4    8:iload_0         
	//    5    9:bipush          20
	//    6   11:isub            
	//    7   12:istore_1        
		return j;
	//    8   13:iload_1         
	//    9   14:ireturn         
	}

	public static boolean isRooted()
	{
		return findBinary("su");
	//    0    0:ldc1            #247 <String "su">
	//    1    2:invokestatic    #249 <Method boolean findBinary(String)>
	//    2    5:ireturn         
	}

	public static int parseColor(String s)
	{
		return getColorFromString(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #251 <Method int getColorFromString(String)>
	//    2    4:ireturn         
	}

	public static int pixelsToDip(int i, Context context)
	{
		return (int)TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
	//    0    0:iconst_1        
	//    1    1:iload_0         
	//    2    2:i2f             
	//    3    3:aload_1         
	//    4    4:invokevirtual   #256 <Method Resources Context.getResources()>
	//    5    7:invokevirtual   #225 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    6   10:invokestatic    #262 <Method float TypedValue.applyDimension(int, float, DisplayMetrics)>
	//    7   13:f2i             
	//    8   14:ireturn         
	}

	public static String sanitizeUnitUrl(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((String)obj).trim();
	//    4    6:aload_0         
	//    5    7:checkcast       #48  <Class String>
	//    6   10:invokevirtual   #267 <Method String String.trim()>
	//    7   13:areturn         
	}
}
