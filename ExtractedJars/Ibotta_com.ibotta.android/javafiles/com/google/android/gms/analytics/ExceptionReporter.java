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
		if(tracker != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          114
		{
			if(context != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          104
			{
				zzqv = uncaughtexceptionhandler;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #24  <Field Thread$UncaughtExceptionHandler zzqv>
				zzqw = tracker;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #26  <Field Tracker zzqw>
				zzqy = ((ExceptionParser) (new StandardExceptionParser(context, ((java.util.Collection) (new ArrayList())))));
	//   12   22:aload_0         
	//   13   23:new             #28  <Class StandardExceptionParser>
	//   14   26:dup             
	//   15   27:aload_3         
	//   16   28:new             #30  <Class ArrayList>
	//   17   31:dup             
	//   18   32:invokespecial   #31  <Method void ArrayList()>
	//   19   35:invokespecial   #34  <Method void StandardExceptionParser(Context, java.util.Collection)>
	//   20   38:putfield        #36  <Field ExceptionParser zzqy>
				zzqx = context.getApplicationContext();
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:invokevirtual   #42  <Method Context Context.getApplicationContext()>
	//   24   46:putfield        #44  <Field Context zzqx>
				if(uncaughtexceptionhandler == null)
	//*  25   49:aload_2         
	//*  26   50:ifnonnull       59
					tracker = "null";
	//   27   53:ldc1            #46  <String "null">
	//   28   55:astore_1        
				else
	//*  29   56:goto            67
					tracker = ((Tracker) (((Object) (uncaughtexceptionhandler)).getClass().getName()));
	//   30   59:aload_2         
	//   31   60:invokevirtual   #50  <Method Class Object.getClass()>
	//   32   63:invokevirtual   #56  <Method String Class.getName()>
	//   33   66:astore_1        
				tracker = ((Tracker) (String.valueOf(((Object) (tracker)))));
	//   34   67:aload_1         
	//   35   68:invokestatic    #62  <Method String String.valueOf(Object)>
	//   36   71:astore_1        
				if(((String) (tracker)).length() != 0)
	//*  37   72:aload_1         
	//*  38   73:invokevirtual   #66  <Method int String.length()>
	//*  39   76:ifeq            89
					tracker = ((Tracker) ("ExceptionReporter created, original handler is ".concat(((String) (tracker)))));
	//   40   79:ldc1            #68  <String "ExceptionReporter created, original handler is ">
	//   41   81:aload_1         
	//   42   82:invokevirtual   #72  <Method String String.concat(String)>
	//   43   85:astore_1        
				else
	//*  44   86:goto            99
					tracker = ((Tracker) (new String("ExceptionReporter created, original handler is ")));
	//   45   89:new             #58  <Class String>
	//   46   92:dup             
	//   47   93:ldc1            #68  <String "ExceptionReporter created, original handler is ">
	//   48   95:invokespecial   #75  <Method void String(String)>
	//   49   98:astore_1        
				zzcl.v(((String) (tracker)));
	//   50   99:aload_1         
	//   51  100:invokestatic    #80  <Method void zzcl.v(String)>
				return;
	//   52  103:return          
			} else
			{
				throw new NullPointerException("context cannot be null");
	//   53  104:new             #82  <Class NullPointerException>
	//   54  107:dup             
	//   55  108:ldc1            #84  <String "context cannot be null">
	//   56  110:invokespecial   #85  <Method void NullPointerException(String)>
	//   57  113:athrow          
			}
		} else
		{
			throw new NullPointerException("tracker cannot be null");
	//   58  114:new             #82  <Class NullPointerException>
	//   59  117:dup             
	//   60  118:ldc1            #87  <String "tracker cannot be null">
	//   61  120:invokespecial   #85  <Method void NullPointerException(String)>
	//   62  123:athrow          
		}
	}

	public ExceptionParser getExceptionParser()
	{
		return zzqy;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ExceptionParser zzqy>
	//    2    4:areturn         
	}

	public void setExceptionParser(ExceptionParser exceptionparser)
	{
		zzqy = exceptionparser;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field ExceptionParser zzqy>
	//    3    5:return          
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		Object obj = "UncaughtException";
	//    0    0:ldc1            #96  <String "UncaughtException">
	//    1    2:astore_3        
		if(zzqy != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #36  <Field ExceptionParser zzqy>
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
	//   14   25:getfield        #36  <Field ExceptionParser zzqy>
	//   15   28:aload_3         
	//   16   29:aload_2         
	//   17   30:invokeinterface #105 <Method String ExceptionParser.getDescription(String, Throwable)>
	//   18   35:astore_3        
		}
		String s = String.valueOf(obj);
	//   19   36:aload_3         
	//   20   37:invokestatic    #62  <Method String String.valueOf(Object)>
	//   21   40:astore          4
		if(s.length() != 0)
	//*  22   42:aload           4
	//*  23   44:invokevirtual   #66  <Method int String.length()>
	//*  24   47:ifeq            62
			s = "Reporting uncaught exception: ".concat(s);
	//   25   50:ldc1            #107 <String "Reporting uncaught exception: ">
	//   26   52:aload           4
	//   27   54:invokevirtual   #72  <Method String String.concat(String)>
	//   28   57:astore          4
		else
	//*  29   59:goto            73
			s = new String("Reporting uncaught exception: ");
	//   30   62:new             #58  <Class String>
	//   31   65:dup             
	//   32   66:ldc1            #107 <String "Reporting uncaught exception: ">
	//   33   68:invokespecial   #75  <Method void String(String)>
	//   34   71:astore          4
		zzcl.v(s);
	//   35   73:aload           4
	//   36   75:invokestatic    #80  <Method void zzcl.v(String)>
		zzqw.send(((HitBuilders.HitBuilder) ((new HitBuilders.ExceptionBuilder()).setDescription(((String) (obj))).setFatal(true))).build());
	//   37   78:aload_0         
	//   38   79:getfield        #26  <Field Tracker zzqw>
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
	//   53  112:getfield        #44  <Field Context zzqx>
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
	//*  67  142:getfield        #24  <Field Thread$UncaughtExceptionHandler zzqv>
	//*  68  145:ifnull          164
		{
			zzcl.v("Passing exception to the original handler");
	//   69  148:ldc1            #161 <String "Passing exception to the original handler">
	//   70  150:invokestatic    #80  <Method void zzcl.v(String)>
			zzqv.uncaughtException(thread, throwable);
	//   71  153:aload_0         
	//   72  154:getfield        #24  <Field Thread$UncaughtExceptionHandler zzqv>
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
	//    1    1:getfield        #24  <Field Thread$UncaughtExceptionHandler zzqv>
	//    2    4:areturn         
	}

	private final Thread.UncaughtExceptionHandler zzqv;
	private final Tracker zzqw;
	private final Context zzqx;
	private ExceptionParser zzqy;
	private GoogleAnalytics zzqz;
}
