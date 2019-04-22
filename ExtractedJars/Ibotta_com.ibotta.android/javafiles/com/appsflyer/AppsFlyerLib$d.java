// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.appsflyer:
//			AppsFlyerLib

final class AppsFlyerLib$d
	implements Runnable
{

	public final void run()
	{
		AppsFlyerLib._mth02CA(_fld02BC, (Context)((Reference) (_fld02CB)).get(), _fld02CE, _fld0971, _fld02CA, _fld09710971, _fld02BB, _fld141D, _fld02CF);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field AppsFlyerLib _fld02BC>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field WeakReference _fld02CB>
	//    4    8:invokevirtual   #64  <Method Object Reference.get()>
	//    5   11:checkcast       #66  <Class Context>
	//    6   14:aload_0         
	//    7   15:getfield        #37  <Field String _fld02CE>
	//    8   18:aload_0         
	//    9   19:getfield        #39  <Field String _fld0971>
	//   10   22:aload_0         
	//   11   23:getfield        #41  <Field String _fld02CA>
	//   12   26:aload_0         
	//   13   27:getfield        #43  <Field String _fld09710971>
	//   14   30:aload_0         
	//   15   31:getfield        #45  <Field boolean _fld02BB>
	//   16   34:aload_0         
	//   17   35:getfield        #49  <Field boolean _fld141D>
	//   18   38:aload_0         
	//   19   39:getfield        #51  <Field Intent _fld02CF>
	//   20   42:invokestatic    #69  <Method void AppsFlyerLib._mth02CA(AppsFlyerLib, Context, String, String, String, String, boolean, boolean, Intent)>
	//   21   45:return          
	}

	private boolean _fld02BB;
	private AppsFlyerLib _fld02BC;
	private ExecutorService _fld02BD;
	private String _fld02CA;
	private WeakReference _fld02CB;
	private String _fld02CE;
	private final Intent _fld02CF;
	private String _fld0971;
	private String _fld09710971;
	private boolean _fld141D;

	private AppsFlyerLib$d(AppsFlyerLib appsflyerlib, WeakReference weakreference, String s, String s1, String s2, String s3, ExecutorService executorservice, 
			boolean flag, Intent intent)
	{
		_fld02BC = appsflyerlib;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field AppsFlyerLib _fld02BC>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void Object()>
		_fld02CB = weakreference;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field WeakReference _fld02CB>
		_fld02CE = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field String _fld02CE>
		_fld0971 = s1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #39  <Field String _fld0971>
		_fld02CA = s2;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #41  <Field String _fld02CA>
		_fld09710971 = s3;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #43  <Field String _fld09710971>
		_fld02BB = true;
	//   20   37:aload_0         
	//   21   38:iconst_1        
	//   22   39:putfield        #45  <Field boolean _fld02BB>
		_fld02BD = executorservice;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #47  <Field ExecutorService _fld02BD>
		_fld141D = flag;
	//   26   48:aload_0         
	//   27   49:iload           8
	//   28   51:putfield        #49  <Field boolean _fld141D>
		_fld02CF = intent;
	//   29   54:aload_0         
	//   30   55:aload           9
	//   31   57:putfield        #51  <Field Intent _fld02CF>
	//   32   60:return          
	}

	AppsFlyerLib$d(AppsFlyerLib appsflyerlib, WeakReference weakreference, String s, String s1, String s2, String s3, ExecutorService executorservice, 
			boolean flag, Intent intent, byte byte0)
	{
		this(appsflyerlib, weakreference, s, s1, s2, s3, executorservice, flag, intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:iload           8
	//    9   14:aload           9
	//   10   16:invokespecial   #57  <Method void AppsFlyerLib$d(AppsFlyerLib, WeakReference, String, String, String, String, ExecutorService, boolean, Intent)>
	//   11   19:return          
	}
}
