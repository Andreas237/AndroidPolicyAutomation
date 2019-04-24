// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.internal.measurement.*;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.analytics:
//			StandardExceptionParser, ExceptionParser, Tracker, GoogleAnalytics, 
//			zza

public class ExceptionReporter
	implements Thread.UncaughtExceptionHandler
{

	public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		if(tracker == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new NullPointerException("tracker cannot be null");
	//    4    8:new             #24  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #26  <String "tracker cannot be null">
	//    7   14:invokespecial   #29  <Method void NullPointerException(String)>
	//    8   17:athrow          
		if(context == null)
	//*   9   18:aload_3         
	//*  10   19:ifnonnull       32
			throw new NullPointerException("context cannot be null");
	//   11   22:new             #24  <Class NullPointerException>
	//   12   25:dup             
	//   13   26:ldc1            #31  <String "context cannot be null">
	//   14   28:invokespecial   #29  <Method void NullPointerException(String)>
	//   15   31:athrow          
		zzqv = uncaughtexceptionhandler;
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:putfield        #33  <Field Thread$UncaughtExceptionHandler zzqv>
		zzqw = tracker;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #35  <Field Tracker zzqw>
		zzqy = ((ExceptionParser) (new StandardExceptionParser(context, ((java.util.Collection) (new ArrayList())))));
	//   22   42:aload_0         
	//   23   43:new             #37  <Class StandardExceptionParser>
	//   24   46:dup             
	//   25   47:aload_3         
	//   26   48:new             #39  <Class ArrayList>
	//   27   51:dup             
	//   28   52:invokespecial   #40  <Method void ArrayList()>
	//   29   55:invokespecial   #43  <Method void StandardExceptionParser(Context, java.util.Collection)>
	//   30   58:putfield        #45  <Field ExceptionParser zzqy>
		zzqx = context.getApplicationContext();
	//   31   61:aload_0         
	//   32   62:aload_3         
	//   33   63:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//   34   66:putfield        #53  <Field Context zzqx>
		if(uncaughtexceptionhandler == null)
	//*  35   69:aload_2         
	//*  36   70:ifnonnull       79
			tracker = "null";
	//   37   73:ldc1            #55  <String "null">
	//   38   75:astore_1        
		else
	//*  39   76:goto            87
			tracker = ((Tracker) (((Object) (uncaughtexceptionhandler)).getClass().getName()));
	//   40   79:aload_2         
	//   41   80:invokevirtual   #59  <Method Class Object.getClass()>
	//   42   83:invokevirtual   #65  <Method String Class.getName()>
	//   43   86:astore_1        
		tracker = ((Tracker) (String.valueOf(((Object) (tracker)))));
	//   44   87:aload_1         
	//   45   88:invokestatic    #71  <Method String String.valueOf(Object)>
	//   46   91:astore_1        
		if(((String) (tracker)).length() != 0)
	//*  47   92:aload_1         
	//*  48   93:invokevirtual   #75  <Method int String.length()>
	//*  49   96:ifeq            109
			tracker = ((Tracker) ("ExceptionReporter created, original handler is ".concat(((String) (tracker)))));
	//   50   99:ldc1            #77  <String "ExceptionReporter created, original handler is ">
	//   51  101:aload_1         
	//   52  102:invokevirtual   #81  <Method String String.concat(String)>
	//   53  105:astore_1        
		else
	//*  54  106:goto            119
			tracker = ((Tracker) (new String("ExceptionReporter created, original handler is ")));
	//   55  109:new             #67  <Class String>
	//   56  112:dup             
	//   57  113:ldc1            #77  <String "ExceptionReporter created, original handler is ">
	//   58  115:invokespecial   #82  <Method void String(String)>
	//   59  118:astore_1        
		zzcl.v(((String) (tracker)));
	//   60  119:aload_1         
	//   61  120:invokestatic    #87  <Method void zzcl.v(String)>
	//   62  123:return          
	}

	public ExceptionParser getExceptionParser()
	{
		return zzqy;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ExceptionParser zzqy>
	//    2    4:areturn         
	}

	public void setExceptionParser(ExceptionParser exceptionparser)
	{
		zzqy = exceptionparser;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field ExceptionParser zzqy>
	//    3    5:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		Object obj = "UncaughtException";
	//    0    0:ldc1            #96  <String "UncaughtException">
	//    1    2:astore_3        
		if(zzqy != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #45  <Field ExceptionParser zzqy>
	//*   4    7:ifnull          36
		{
			if(thread != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          22
				obj = ((Object) (thread.getName()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #99  <Method String Thread.getName()>
	//    9   18:astore_3        
			else
	//*  10   19:goto            24
				obj = null;
	//   11   22:aconst_null     
	//   12   23:astore_3        
			obj = ((Object) (zzqy.getDescription(((String) (obj)), throwable)));
	//   13   24:aload_0         
	//   14   25:getfield        #45  <Field ExceptionParser zzqy>
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokeinterface #105 <Method String ExceptionParser.getDescription(String, Throwable)>
	//   18   35:astore_3        
		}
		String s = String.valueOf(obj);
	//   19   36:aload_3         
	//   20   37:invokestatic    #71  <Method String String.valueOf(Object)>
	//   21   40:astore          4
		if(s.length() != 0)
	//*  22   42:aload           4
	//*  23   44:invokevirtual   #75  <Method int String.length()>
	//*  24   47:ifeq            62
			s = "Reporting uncaught exception: ".concat(s);
	//   25   50:ldc1            #107 <String "Reporting uncaught exception: ">
	//   26   52:aload           4
	//   27   54:invokevirtual   #81  <Method String String.concat(String)>
	//   28   57:astore          4
		else
	//*  29   59:goto            73
			s = new String("Reporting uncaught exception: ");
	//   30   62:new             #67  <Class String>
	//   31   65:dup             
	//   32   66:ldc1            #107 <String "Reporting uncaught exception: ">
	//   33   68:invokespecial   #82  <Method void String(String)>
	//   34   71:astore          4
		zzcl.v(s);
	//   35   73:aload           4
	//   36   75:invokestatic    #87  <Method void zzcl.v(String)>
		zzqw.send(((HitBuilders.HitBuilder) ((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true))).build());
	//   37   78:aload_0         
	//   38   79:getfield        #35  <Field Tracker zzqw>
	//   39   82:new             #109 <Class HitBuilders$ExceptionBuilder>
	//   40   85:dup             
	//   41   86:invokespecial   #110 <Method void HitBuilders$ExceptionBuilder()>
	//   42   89:aload_3         
	//   43   90:invokevirtual   #114 <Method HitBuilders$ExceptionBuilder HitBuilders$ExceptionBuilder.setDescription(String)>
	//   44   93:iconst_1        
	//   45   94:invokevirtual   #118 <Method HitBuilders$ExceptionBuilder HitBuilders$ExceptionBuilder.setFatal(boolean)>
	//   46   97:invokevirtual   #124 <Method java.util.Map HitBuilders$HitBuilder.build()>
	//   47  100:invokevirtual   #130 <Method void Tracker.send(java.util.Map)>
		if(zzqz == null)
	//*  48  103:aload_0         
	//*  49  104:getfield        #132 <Field GoogleAnalytics zzqz>
	//*  50  107:ifnonnull       121
			zzqz = GoogleAnalytics.getInstance(zzqx);
	//   51  110:aload_0         
	//   52  111:aload_0         
	//   53  112:getfield        #53  <Field Context zzqx>
	//   54  115:invokestatic    #138 <Method GoogleAnalytics GoogleAnalytics.getInstance(Context)>
	//   55  118:putfield        #132 <Field GoogleAnalytics zzqz>
		obj = ((Object) (zzqz));
	//   56  121:aload_0         
	//   57  122:getfield        #132 <Field GoogleAnalytics zzqz>
	//   58  125:astore_3        
		((GoogleAnalytics) (obj)).dispatchLocalHits();
	//   59  126:aload_3         
	//   60  127:invokevirtual   #141 <Method void GoogleAnalytics.dispatchLocalHits()>
		((zza) (obj)).zzh().zzby().zzbp();
	//   61  130:aload_3         
	//   62  131:invokevirtual   #147 <Method zzat zza.zzh()>
	//   63  134:invokevirtual   #153 <Method zzai zzat.zzby()>
	//   64  137:invokevirtual   #159 <Method boolean zzai.zzbp()>
	//   65  140:pop             
		if(zzqv != null)
	//*  66  141:aload_0         
	//*  67  142:getfield        #33  <Field Thread$UncaughtExceptionHandler zzqv>
	//*  68  145:ifnull          164
		{
			zzcl.v("Passing exception to the original handler");
	//   69  148:ldc1            #161 <String "Passing exception to the original handler">
	//   70  150:invokestatic    #87  <Method void zzcl.v(String)>
			zzqv.uncaughtException(thread, throwable);
	//   71  153:aload_0         
	//   72  154:getfield        #33  <Field Thread$UncaughtExceptionHandler zzqv>
	//   73  157:aload_1         
	//   74  158:aload_2         
	//   75  159:invokeinterface #163 <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   76  164:return          
	}

	final Thread.UncaughtExceptionHandler zzl()
	{
		return zzqv;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Thread$UncaughtExceptionHandler zzqv>
	//    2    4:areturn         
	}

	private final Thread.UncaughtExceptionHandler zzqv;
	private final Tracker zzqw;
	private final Context zzqx;
	private ExceptionParser zzqy;
	private GoogleAnalytics zzqz;
}
