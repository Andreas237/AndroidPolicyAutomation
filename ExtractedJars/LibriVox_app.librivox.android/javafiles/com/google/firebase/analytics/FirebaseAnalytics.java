// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.*;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics
{

	private FirebaseAnalytics(ax ax1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		am.a(((Object) (ax1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #20  <Method Object am.a(Object)>
	//    4    8:pop             
		b = ax1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #22  <Field ax b>
	//    8   14:aload_0         
	//    9   15:new             #4   <Class Object>
	//   10   18:dup             
	//   11   19:invokespecial   #15  <Method void Object()>
	//   12   22:putfield        #24  <Field Object c>
	//   13   25:return          
	}

	public static FirebaseAnalytics getInstance(Context context)
	{
		if(a != null)
			break MISSING_BLOCK_LABEL_42;
	//    0    0:getstatic       #30  <Field FirebaseAnalytics a>
	//    1    3:ifnonnull       42
		com/google/firebase/analytics/FirebaseAnalytics;
	//    2    6:ldc1            #2   <Class FirebaseAnalytics>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(a == null)
	//*   4    9:getstatic       #30  <Field FirebaseAnalytics a>
	//*   5   12:ifnonnull       30
			a = new FirebaseAnalytics(ax.a(context, ((com.google.android.gms.measurement.internal.n) (null))));
	//    6   15:new             #2   <Class FirebaseAnalytics>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:aconst_null     
	//   10   21:invokestatic    #35  <Method ax ax.a(Context, com.google.android.gms.measurement.internal.n)>
	//   11   24:invokespecial   #37  <Method void FirebaseAnalytics(ax)>
	//   12   27:putstatic       #30  <Field FirebaseAnalytics a>
		com/google/firebase/analytics/FirebaseAnalytics;
	//   13   30:ldc1            #2   <Class FirebaseAnalytics>
		JVM INSTR monitorexit ;
	//   14   32:monitorexit     
		break MISSING_BLOCK_LABEL_42;
	//   15   33:goto            42
		context;
	//   16   36:astore_0        
		com/google/firebase/analytics/FirebaseAnalytics;
	//   17   37:ldc1            #2   <Class FirebaseAnalytics>
		JVM INSTR monitorexit ;
	//   18   39:monitorexit     
		throw context;
	//   19   40:aload_0         
	//   20   41:athrow          
		return a;
	//   21   42:getstatic       #30  <Field FirebaseAnalytics a>
	//   22   45:areturn         
	}

	public final void a(String s1, Bundle bundle)
	{
		b.i().a(s1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ax b>
	//    2    4:invokevirtual   #43  <Method AppMeasurement ax.i()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #47  <Method void AppMeasurement.a(String, Bundle)>
	//    6   12:return          
	}

	public final String getFirebaseInstanceId()
	{
		return FirebaseInstanceId.a().c();
	//    0    0:invokestatic    #54  <Method FirebaseInstanceId FirebaseInstanceId.a()>
	//    1    3:invokevirtual   #56  <Method String FirebaseInstanceId.c()>
	//    2    6:areturn         
	}

	public final void setCurrentScreen(Activity activity, String s1, String s2)
	{
		if(!eu.a())
	//*   0    0:invokestatic    #63  <Method boolean eu.a()>
	//*   1    3:ifne            22
		{
			b.r().i().a("setCurrentScreen must be called from the main thread");
	//    2    6:aload_0         
	//    3    7:getfield        #22  <Field ax b>
	//    4   10:invokevirtual   #67  <Method s ax.r()>
	//    5   13:invokevirtual   #72  <Method u s.i()>
	//    6   16:ldc1            #74  <String "setCurrentScreen must be called from the main thread">
	//    7   18:invokevirtual   #79  <Method void u.a(String)>
			return;
	//    8   21:return          
		} else
		{
			b.w().a(activity, s1, s2);
	//    9   22:aload_0         
	//   10   23:getfield        #22  <Field ax b>
	//   11   26:invokevirtual   #83  <Method cr ax.w()>
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:aload_3         
	//   15   32:invokevirtual   #87  <Method void cr.a(Activity, String, String)>
			return;
	//   16   35:return          
		}
	}

	private static volatile FirebaseAnalytics a;
	private final ax b;
	private final Object c = new Object();
}
