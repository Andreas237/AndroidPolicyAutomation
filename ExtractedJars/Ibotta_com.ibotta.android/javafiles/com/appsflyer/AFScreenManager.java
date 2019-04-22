// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.appsflyer:
//			AFLogger

public class AFScreenManager
{

	public static Map getScreenMetrics(Context context)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #11  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void HashMap()>
	//    3    7:astore_2        
		try
		{
			DisplayMetrics displaymetrics = new DisplayMetrics();
	//    4    8:new             #17  <Class DisplayMetrics>
	//    5   11:dup             
	//    6   12:invokespecial   #18  <Method void DisplayMetrics()>
	//    7   15:astore_3        
			((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
	//    8   16:aload_0         
	//    9   17:ldc1            #20  <String "window">
	//   10   19:invokevirtual   #26  <Method Object Context.getSystemService(String)>
	//   11   22:checkcast       #28  <Class WindowManager>
	//   12   25:invokeinterface #32  <Method Display WindowManager.getDefaultDisplay()>
	//   13   30:aload_3         
	//   14   31:invokevirtual   #38  <Method void Display.getMetrics(DisplayMetrics)>
			int i = context.getResources().getConfiguration().screenLayout;
	//   15   34:aload_0         
	//   16   35:invokevirtual   #42  <Method Resources Context.getResources()>
	//   17   38:invokevirtual   #48  <Method Configuration Resources.getConfiguration()>
	//   18   41:getfield        #54  <Field int Configuration.screenLayout>
	//   19   44:istore_1        
			((Map) (hashmap)).put("x_px", ((Object) (String.valueOf(displaymetrics.widthPixels))));
	//   20   45:aload_2         
	//   21   46:ldc1            #56  <String "x_px">
	//   22   48:aload_3         
	//   23   49:getfield        #59  <Field int DisplayMetrics.widthPixels>
	//   24   52:invokestatic    #65  <Method String String.valueOf(int)>
	//   25   55:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   26   60:pop             
			((Map) (hashmap)).put("y_px", ((Object) (String.valueOf(displaymetrics.heightPixels))));
	//   27   61:aload_2         
	//   28   62:ldc1            #73  <String "y_px">
	//   29   64:aload_3         
	//   30   65:getfield        #76  <Field int DisplayMetrics.heightPixels>
	//   31   68:invokestatic    #65  <Method String String.valueOf(int)>
	//   32   71:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   33   76:pop             
			((Map) (hashmap)).put("d_dpi", ((Object) (String.valueOf(displaymetrics.densityDpi))));
	//   34   77:aload_2         
	//   35   78:ldc1            #78  <String "d_dpi">
	//   36   80:aload_3         
	//   37   81:getfield        #81  <Field int DisplayMetrics.densityDpi>
	//   38   84:invokestatic    #65  <Method String String.valueOf(int)>
	//   39   87:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   40   92:pop             
			((Map) (hashmap)).put("size", ((Object) (String.valueOf(i & 0xf))));
	//   41   93:aload_2         
	//   42   94:ldc1            #83  <String "size">
	//   43   96:iload_1         
	//   44   97:bipush          15
	//   45   99:iand            
	//   46  100:invokestatic    #65  <Method String String.valueOf(int)>
	//   47  103:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   48  108:pop             
			((Map) (hashmap)).put("xdp", ((Object) (String.valueOf(displaymetrics.xdpi))));
	//   49  109:aload_2         
	//   50  110:ldc1            #85  <String "xdp">
	//   51  112:aload_3         
	//   52  113:getfield        #89  <Field float DisplayMetrics.xdpi>
	//   53  116:invokestatic    #92  <Method String String.valueOf(float)>
	//   54  119:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   55  124:pop             
			((Map) (hashmap)).put("ydp", ((Object) (String.valueOf(displaymetrics.ydpi))));
	//   56  125:aload_2         
	//   57  126:ldc1            #94  <String "ydp">
	//   58  128:aload_3         
	//   59  129:getfield        #97  <Field float DisplayMetrics.ydpi>
	//   60  132:invokestatic    #92  <Method String String.valueOf(float)>
	//   61  135:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   62  140:pop             
		}
	//*  63  141:aload_2         
	//*  64  142:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  65  143:astore_0        
		{
			AFLogger.afErrorLog("Couldn't aggregate screen stats: ", ((Throwable) (context)));
	//   66  144:ldc1            #99  <String "Couldn't aggregate screen stats: ">
	//   67  146:aload_0         
	//   68  147:invokestatic    #105 <Method void AFLogger.afErrorLog(String, Throwable)>
			return ((Map) (hashmap));
	//   69  150:aload_2         
	//   70  151:areturn         
		}
		return ((Map) (hashmap));
	}
}
