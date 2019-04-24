// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.*;

public class GlMapUtil
{

	public GlMapUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	public static byte[] decodeAssetResData(Context context, String s)
	{
		context = ((Context) (context.getAssets()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method AssetManager Context.getAssets()>
	//    2    4:astore_0        
		byte abyte0[];
		context = ((Context) (((AssetManager) (context)).open(s)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #64  <Method InputStream AssetManager.open(String)>
	//    6   10:astore_0        
		s = ((String) (new ByteArrayOutputStream()));
	//    7   11:new             #66  <Class ByteArrayOutputStream>
	//    8   14:dup             
	//    9   15:invokespecial   #67  <Method void ByteArrayOutputStream()>
	//   10   18:astore_1        
		abyte0 = new byte[1024];
	//   11   19:sipush          1024
	//   12   22:newarray        byte[]
	//   13   24:astore_3        
_L1:
		int i = ((InputStream) (context)).read(abyte0);
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #73  <Method int InputStream.read(byte[])>
	//   17   30:istore_2        
label0:
		{
			if(i <= -1)
				break label0;
	//   18   31:iload_2         
	//   19   32:iconst_m1       
	//   20   33:icmple          46
			try
			{
				((ByteArrayOutputStream) (s)).write(abyte0, 0, i);
	//   21   36:aload_1         
	//   22   37:aload_3         
	//   23   38:iconst_0        
	//   24   39:iload_2         
	//   25   40:invokevirtual   #77  <Method void ByteArrayOutputStream.write(byte[], int, int)>
			}
	//*  26   43:goto            25
	//*  27   46:aload_1         
	//*  28   47:invokevirtual   #81  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  29   50:astore_3        
	//*  30   51:aload_1         
	//*  31   52:invokevirtual   #84  <Method void ByteArrayOutputStream.close()>
	//*  32   55:aload_0         
	//*  33   56:invokevirtual   #85  <Method void InputStream.close()>
	//*  34   59:aload_3         
	//*  35   60:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  36   61:astore_0        
			{
				return null;
	//   37   62:aconst_null     
	//   38   63:areturn         
			}
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  39   64:astore_0        
			{
				return null;
	//   40   65:aconst_null     
	//   41   66:areturn         
			}
		}
		  goto _L1
		abyte0 = ((ByteArrayOutputStream) (s)).toByteArray();
		((ByteArrayOutputStream) (s)).close();
		((InputStream) (context)).close();
		return abyte0;
	}

	public static int dipToPixel(Context context, int i)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return i;
	//    2    4:iload_1         
	//    3    5:ireturn         
		float f = i;
	//    4    6:iload_1         
	//    5    7:i2f             
	//    6    8:fstore_2        
		try
		{
			f = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
	//    7    9:iconst_1        
	//    8   10:fload_2         
	//    9   11:aload_0         
	//   10   12:invokevirtual   #93  <Method Resources Context.getResources()>
	//   11   15:invokevirtual   #99  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   12   18:invokestatic    #105 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   13   21:fstore_2        
		}
	//*  14   22:fload_2         
	//*  15   23:f2i             
	//*  16   24:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  17   25:astore_0        
		{
			return i;
	//   18   26:iload_1         
	//   19   27:ireturn         
		}
		return (int)f;
	}

	public static String getAppVersionName(Context context)
	{
		try
		{
			context = ((Context) (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #117 <Method String Context.getPackageName()>
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #123 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//    6   12:getfield        #129 <Field String PackageInfo.versionName>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  10   18:astore_0        
		{
			return "";
	//   11   19:ldc1            #131 <String "">
	//   12   21:areturn         
		}
		return ((String) (context));
	}

	public static String getString(Context context, int i)
	{
		return context.getResources().getString(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method String Resources.getString(int)>
	//    4    8:areturn         
	}

	public static boolean isAssic(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #144 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		s = ((String) (s.toCharArray()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #150 <Method char[] String.toCharArray()>
	//    7   13:astore_0        
		for(int i = 0; i < s.length; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:aload_0         
	//*  12   18:arraylength     
	//*  13   19:icmpge          46
			if(s[i] >= '\u0100' || s[i] <= 0)
	//*  14   22:aload_0         
	//*  15   23:iload_1         
	//*  16   24:caload          
	//*  17   25:sipush          256
	//*  18   28:icmpge          37
	//*  19   31:aload_0         
	//*  20   32:iload_1         
	//*  21   33:caload          
	//*  22   34:ifgt            39
				return false;
	//   23   37:iconst_0        
	//   24   38:ireturn         

	//   25   39:iload_1         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_1        
	//*  29   43:goto            16
		return true;
	//   30   46:iconst_1        
	//   31   47:ireturn         
	}

	public static int spToPixel(Context context, int i)
	{
		return (int)TypedValue.applyDimension(2, i, context.getResources().getDisplayMetrics());
	//    0    0:iconst_2        
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:aload_0         
	//    4    4:invokevirtual   #93  <Method Resources Context.getResources()>
	//    5    7:invokevirtual   #99  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    6   10:invokestatic    #105 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//    7   13:f2i             
	//    8   14:ireturn         
	}

	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1 = 2;
	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_1_EAGLE_EYE = 3;
	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2 = 4;
	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_2_EAGLE_EYE = 5;
	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3 = 6;
	public static final int AMAP_ENGINE_TYPE_DISPLAY_EXTERNAL_3_EAGLE_EYE = 7;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_1 = 3;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_1_EAGLE_EYE = 4;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_2 = 5;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_2_EAGLE_EYE = 6;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_3 = 7;
	public static final int AN_ENGINE_ID_DISPLAY_EXTERNAL_3_EAGLE_EYE = 8;
	public static final int AN_ENGINE_ID_EAGLE_EYE = 2;
	public static final int AN_ENGINE_ID_INVALID = -1;
	public static final int AN_ENGINE_ID_MAIN = 1;
	public static final int DEVICE_DISPLAY_DPI_HIGH = 320;
	public static final int DEVICE_DISPLAY_DPI_LOW = 120;
	public static final int DEVICE_DISPLAY_DPI_MEDIAN = 240;
	public static final int DEVICE_DISPLAY_DPI_NORMAL = 160;
	public static final int DEVICE_DISPLAY_DPI_XHIGH = 480;
	public static final int DEVICE_DISPLAY_DPI_XXHIGH = 640;
}
