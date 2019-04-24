// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import com.amap.api.mapcore.util.*;

// Referenced classes of package com.amap.api.maps:
//			AMapUtils

static class AMapUtils$a extends Thread
{

	public void run()
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Context b>
	//*   2    4:ifnull          58
			try
			{
				com.amap.api.mapcore.util.gy gy = (new com.amap.api.mapcore.util.gy.a(a, "6.3.1", l.c)).a(new String[] {
					"com.amap.api.maps"
				}).a();
	//    3    7:new             #33  <Class com.amap.api.mapcore.util.gy$a>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field String a>
	//    7   15:ldc1            #35  <String "6.3.1">
	//    8   17:getstatic       #40  <Field String l.c>
	//    9   20:invokespecial   #43  <Method void com.amap.api.mapcore.util.gy$a(String, String, String)>
	//   10   23:iconst_1        
	//   11   24:anewarray       String[]
	//   12   27:dup             
	//   13   28:iconst_0        
	//   14   29:ldc1            #47  <String "com.amap.api.maps">
	//   15   31:aastore         
	//   16   32:invokevirtual   #50  <Method com.amap.api.mapcore.util.gy$a com.amap.api.mapcore.util.gy$a.a(String[])>
	//   17   35:invokevirtual   #53  <Method com.amap.api.mapcore.util.gy com.amap.api.mapcore.util.gy$a.a()>
	//   18   38:astore_1        
				gq.a(b, gy);
	//   19   39:aload_0         
	//   20   40:getfield        #27  <Field Context b>
	//   21   43:aload_1         
	//   22   44:invokestatic    #58  <Method boolean gq.a(Context, com.amap.api.mapcore.util.gy)>
	//   23   47:pop             
				interrupt();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #61  <Method void interrupt()>
				return;
	//   26   52:return          
			}
			catch(gn gn1)
	//*  27   53:astore_1        
			{
				gn1.printStackTrace();
	//   28   54:aload_1         
	//   29   55:invokevirtual   #64  <Method void gn.printStackTrace()>
			}
	//   30   58:return          
	}

	String a;
	Context b;

	public AMapUtils$a(String s, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Thread()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "">
	//    4    7:putfield        #19  <Field String a>
		a = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #19  <Field String a>
		if(context != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          27
			b = context.getApplicationContext();
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//   13   24:putfield        #27  <Field Context b>
	//   14   27:return          
	}
}
