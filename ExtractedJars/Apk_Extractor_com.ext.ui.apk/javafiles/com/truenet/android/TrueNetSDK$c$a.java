// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.*;
import android.util.Log;
import com.startapp.common.b.a.b;
import java.util.Map;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK

static final class TrueNetSDK$c$a extends af
	implements v
{

	public Object a()
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method void b()>
		return ((Object) (br.a));
	//    2    4:getstatic       #44  <Field br br.a>
	//    3    7:areturn         
	}

	public final void b()
	{
		Log.d("JobManager", (new StringBuilder()).append("finished ").append(String.valueOf($jobId$inlined)).toString());
	//    0    0:ldc1            #46  <String "JobManager">
	//    1    2:new             #48  <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #50  <Method void StringBuilder()>
	//    4    9:ldc1            #52  <String "finished ">
	//    5   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field int $jobId$inlined>
	//    8   18:invokestatic    #62  <Method String String.valueOf(int)>
	//    9   21:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #72  <Method int Log.d(String, String)>
	//   12   30:pop             
		$runnerListener$inlined.a(com.startapp.common.b.a.b.a.a);
	//   13   31:aload_0         
	//   14   32:getfield        #30  <Field com.startapp.common.b.a.b$b $runnerListener$inlined>
	//   15   35:getstatic       #77  <Field com.startapp.common.b.a.b$a com.startapp.common.b.a.b$a.a>
	//   16   38:invokeinterface #82  <Method void com.startapp.common.b.a.b$b.a(com.startapp.common.b.a.b$a)>
	//   17   43:return          
	}

	final Context $context$inlined;
	final Map $extras$inlined;
	final int $jobId$inlined;
	final com.startapp.common.b.a.b.b $runnerListener$inlined;

	TrueNetSDK$c$a(Map map, Context context, int i, com.startapp.common.b.a.b.b b1)
	{
		$extras$inlined = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Map $extras$inlined>
		$context$inlined = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field Context $context$inlined>
		$jobId$inlined = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field int $jobId$inlined>
		$runnerListener$inlined = b1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field com.startapp.common.b.a.b$b $runnerListener$inlined>
		super(0);
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:invokespecial   #33  <Method void af(int)>
	//   15   26:return          
	}

	// Unreferenced inner class com/truenet/android/TrueNetSDK$c
	static final class TrueNetSDK.c
		implements b
	{

		public final void a(Context context, int i, Map map, com.startapp.common.b.a.b.b b1)
		{
			TrueNetSDK truenetsdk = a;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field TrueNetSDK a>
		//    2    4:astore          5
			truenetsdk;
		//    3    6:aload           5
			JVM INSTR monitorenter ;
		//    4    8:monitorenter    
			if(ae.a(((Object) ((String)map.get("TruenetCheckLinksJob"))), "TruenetJobKey"))
		//*   5    9:aload_3         
		//*   6   10:ldc1            #26  <String "TruenetCheckLinksJob">
		//*   7   12:invokeinterface #32  <Method Object Map.get(Object)>
		//*   8   17:checkcast       #34  <Class String>
		//*   9   20:ldc1            #36  <String "TruenetJobKey">
		//*  10   22:invokestatic    #41  <Method boolean ae.a(Object, Object)>
		//*  11   25:ifeq            60
			{
				TrueNetSDK.a a1 = TrueNetSDK.Companion;
		//   12   28:getstatic       #45  <Field TrueNetSDK$a TrueNetSDK.Companion>
		//   13   31:astore          6
				ae.a(((Object) (context)), "context");
		//   14   33:aload_1         
		//   15   34:ldc1            #47  <String "context">
		//   16   36:invokestatic    #50  <Method void ae.a(Object, String)>
				a1.a(context, (v)new TrueNetSDK.c.a(map, context, i, b1));
		//   17   39:aload           6
		//   18   41:aload_1         
		//   19   42:new             #13  <Class TrueNetSDK$c$a>
		//   20   45:dup             
		//   21   46:aload_3         
		//   22   47:aload_1         
		//   23   48:iload_2         
		//   24   49:aload           4
		//   25   51:invokespecial   #53  <Method void TrueNetSDK$c$a(Map, Context, int, com.startapp.common.b.a.b$b)>
		//   26   54:checkcast       #55  <Class v>
		//   27   57:invokevirtual   #60  <Method void TrueNetSDK$a.a(Context, v)>
			}
			context = ((Context) (br.a));
		//   28   60:getstatic       #65  <Field br br.a>
		//   29   63:astore_1        
			truenetsdk;
		//   30   64:aload           5
			JVM INSTR monitorexit ;
		//   31   66:monitorexit     
			return;
		//   32   67:return          
			context;
		//   33   68:astore_1        
		//*  34   69:aload           5
			throw context;
		//   35   71:monitorexit     
		//   36   72:aload_1         
		//   37   73:athrow          
		}

		final TrueNetSDK a;

			TrueNetSDK.c(TrueNetSDK truenetsdk)
			{
				a = truenetsdk;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field TrueNetSDK a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
	}

}
