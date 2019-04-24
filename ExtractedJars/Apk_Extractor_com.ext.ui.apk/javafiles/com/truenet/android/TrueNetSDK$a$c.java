// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.v;
import com.truenet.android.a.g;

// Referenced classes of package com.truenet.android:
//			TrueNetSDK

static final class TrueNetSDK$a$c
	implements Runnable
{

	public final void run()
	{
		boolean flag;
		Object obj;
		if(TrueNetSDK.access$getRequestDelay$cp() != 0L)
	//*   0    0:invokestatic    #30  <Method long TrueNetSDK.access$getRequestDelay$cp()>
	//*   1    3:lconst_0        
	//*   2    4:lcmp            
	//*   3    5:ifeq            51
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:invokestatic    #34  <Method java.net.URL TrueNetSDK.access$getInitUrl$cp()>
	//*   7   13:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//*   8   16:aload_0         
	//*   9   17:getfield        #19  <Field Context a>
	//*  10   20:invokestatic    #41  <Method String TrueNetSDK$a.a(TrueNetSDK$a, Context)>
	//*  11   23:aload_0         
	//*  12   24:getfield        #19  <Field Context a>
	//*  13   27:invokestatic    #46  <Method String g.b(java.net.URL, String, Context)>
	//*  14   30:astore_2        
	//*  15   31:aload_2         
	//*  16   32:ifnull          56
	//*  17   35:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//*  18   38:aload_0         
	//*  19   39:getfield        #19  <Field Context a>
	//*  20   42:aload_2         
	//*  21   43:aload_0         
	//*  22   44:getfield        #21  <Field v b>
	//*  23   47:invokestatic    #49  <Method void TrueNetSDK$a.a(TrueNetSDK$a, Context, String, v)>
	//*  24   50:return          
			flag = false;
	//   25   51:iconst_0        
	//   26   52:istore_1        
		obj = ((Object) (g.b(TrueNetSDK.access$getInitUrl$cp(), TrueNetSDK.a.a(TrueNetSDK.Companion, a), a)));
		if(obj != null)
		{
			TrueNetSDK.a.a(TrueNetSDK.Companion, a, ((String) (obj)), b);
			return;
		}
	//*  27   53:goto            10
		obj = ((Object) (TrueNetSDK.Companion));
	//   28   56:getstatic       #38  <Field TrueNetSDK$a TrueNetSDK.Companion>
	//   29   59:astore_2        
		int i;
		if(flag)
	//*  30   60:iload_1         
	//*  31   61:ifeq            85
			i = TrueNetSDK.access$getIntervalPosition$cp();
	//   32   64:invokestatic    #53  <Method int TrueNetSDK.access$getIntervalPosition$cp()>
	//   33   67:istore_1        
		else
	//*  34   68:aload_2         
	//*  35   69:iload_1         
	//*  36   70:lconst_0        
	//*  37   71:invokestatic    #56  <Method void TrueNetSDK$a.a(TrueNetSDK$a, int, long)>
	//*  38   74:aload_0         
	//*  39   75:getfield        #21  <Field v b>
	//*  40   78:invokeinterface #61  <Method Object v.a()>
	//*  41   83:pop             
	//*  42   84:return          
			i = TrueNetSDK.access$getIntervalPosition$cp() + 1;
	//   43   85:invokestatic    #53  <Method int TrueNetSDK.access$getIntervalPosition$cp()>
	//   44   88:iconst_1        
	//   45   89:iadd            
	//   46   90:istore_1        
		TrueNetSDK.a.a(((TrueNetSDK.a) (obj)), i, 0L);
		b.a();
	//*  47   91:goto            68
	}

	final Context a;
	final v b;

	TrueNetSDK$a$c(Context context, v v1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context a>
		b = v1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field v b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
