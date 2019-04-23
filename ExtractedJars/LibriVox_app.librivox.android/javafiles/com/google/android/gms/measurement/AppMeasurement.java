// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.g.a;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.internal.ax;
import com.google.android.gms.measurement.internal.cd;
import com.google.android.gms.measurement.internal.eo;
import com.google.android.gms.measurement.internal.zzfu;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AppMeasurement
{

	public AppMeasurement(ax ax1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		am.a(((Object) (ax1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #17  <Method Object am.a(Object)>
	//    4    8:pop             
		a = ax1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field ax a>
	//    8   14:return          
	}

	public static AppMeasurement getInstance(Context context)
	{
		return ax.a(context, ((com.google.android.gms.measurement.internal.n) (null))).i();
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #28  <Method ax ax.a(Context, com.google.android.gms.measurement.internal.n)>
	//    3    5:invokevirtual   #32  <Method AppMeasurement ax.i()>
	//    4    8:areturn         
	}

	public final void a(String s, Bundle bundle)
	{
		a.h().a("app", s, bundle, true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:ldc1            #41  <String "app">
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #46  <Method void cd.a(String, String, Bundle, boolean)>
	//    8   15:return          
	}

	public final void a(boolean flag)
	{
		a.h().a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #49  <Method void cd.a(boolean)>
	//    5   11:return          
	}

	public Map b(boolean flag)
	{
		Object obj = ((Object) (a.h().b(flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #54  <Method List cd.b(boolean)>
	//    5   11:astore_3        
		a a1 = new a(((List) (obj)).size());
	//    6   12:new             #56  <Class a>
	//    7   15:dup             
	//    8   16:aload_3         
	//    9   17:invokeinterface #62  <Method int List.size()>
	//   10   22:invokespecial   #65  <Method void a(int)>
	//   11   25:astore_2        
		zzfu zzfu1;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Map) (a1)).put(((Object) (zzfu1.a)), zzfu1.a()))
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #69  <Method Iterator List.iterator()>
	//*  14   32:astore_3        
	//*  15   33:aload_3         
	//*  16   34:invokeinterface #75  <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            73
			zzfu1 = (zzfu)((Iterator) (obj)).next();
	//   18   42:aload_3         
	//   19   43:invokeinterface #79  <Method Object Iterator.next()>
	//   20   48:checkcast       #81  <Class zzfu>
	//   21   51:astore          4

	//   22   53:aload_2         
	//   23   54:aload           4
	//   24   56:getfield        #84  <Field String zzfu.a>
	//   25   59:aload           4
	//   26   61:invokevirtual   #86  <Method Object zzfu.a()>
	//   27   64:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   28   69:pop             
	//*  29   70:goto            33
		return ((Map) (a1));
	//   30   73:aload_2         
	//   31   74:areturn         
	}

	public void beginAdUnitExposure(String s)
	{
		a.A().a(s, a.m().b());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #98  <Method com.google.android.gms.measurement.internal.a ax.A()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ax a>
	//    6   12:invokevirtual   #102 <Method e ax.m()>
	//    7   15:invokeinterface #107 <Method long e.b()>
	//    8   20:invokevirtual   #112 <Method void com.google.android.gms.measurement.internal.a.a(String, long)>
	//    9   23:return          
	}

	public void clearConditionalUserProperty(String s, String s1, Bundle bundle)
	{
		a.h().c(s, s1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #117 <Method void cd.c(String, String, Bundle)>
	//    7   13:return          
	}

	protected void clearConditionalUserPropertyAs(String s, String s1, String s2, Bundle bundle)
	{
		a.h().a(s, s1, s2, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokevirtual   #121 <Method void cd.a(String, String, String, Bundle)>
	//    8   15:return          
	}

	public void endAdUnitExposure(String s)
	{
		a.A().b(s, a.m().b());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #98  <Method com.google.android.gms.measurement.internal.a ax.A()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field ax a>
	//    6   12:invokevirtual   #102 <Method e ax.m()>
	//    7   15:invokeinterface #107 <Method long e.b()>
	//    8   20:invokevirtual   #124 <Method void com.google.android.gms.measurement.internal.a.b(String, long)>
	//    9   23:return          
	}

	public long generateEventId()
	{
		return a.j().g();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #129 <Method eo ax.j()>
	//    3    7:invokevirtual   #134 <Method long eo.g()>
	//    4   10:lreturn         
	}

	public String getAppInstanceId()
	{
		return a.h().x();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:invokevirtual   #139 <Method String cd.x()>
	//    4   10:areturn         
	}

	public List getConditionalUserProperties(String s, String s1)
	{
		return a.h().a(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #143 <Method List cd.a(String, String)>
	//    6   12:areturn         
	}

	protected List getConditionalUserPropertiesAs(String s, String s1, String s2)
	{
		return a.h().a(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #147 <Method List cd.a(String, String, String)>
	//    7   13:areturn         
	}

	public String getCurrentScreenClass()
	{
		return a.h().A();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:invokevirtual   #150 <Method String cd.A()>
	//    4   10:areturn         
	}

	public String getCurrentScreenName()
	{
		return a.h().z();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:invokevirtual   #154 <Method String cd.z()>
	//    4   10:areturn         
	}

	public String getGmpAppId()
	{
		return a.h().B();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:invokevirtual   #158 <Method String cd.B()>
	//    4   10:areturn         
	}

	public int getMaxUserProperties(String s)
	{
		a.h();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:pop             
		am.a(s);
	//    4    8:aload_1         
	//    5    9:invokestatic    #163 <Method String am.a(String)>
	//    6   12:pop             
		return 25;
	//    7   13:bipush          25
	//    8   15:ireturn         
	}

	protected Map getUserProperties(String s, String s1, boolean flag)
	{
		return a.h().a(s, s1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #167 <Method Map cd.a(String, String, boolean)>
	//    7   13:areturn         
	}

	protected Map getUserPropertiesAs(String s, String s1, String s2, boolean flag)
	{
		return a.h().a(s, s1, s2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #171 <Method Map cd.a(String, String, String, boolean)>
	//    8   15:areturn         
	}

	public void logEventInternal(String s, String s1, Bundle bundle)
	{
		a.h().a(s, s1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #174 <Method void cd.a(String, String, Bundle)>
	//    7   13:return          
	}

	public void registerOnMeasurementEventListener(OnEventListener oneventlistener)
	{
		a.h().a(((com.google.android.gms.measurement.internal.ca) (oneventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #179 <Method void cd.a(com.google.android.gms.measurement.internal.ca)>
	//    5   11:return          
	}

	public void setConditionalUserProperty(ConditionalUserProperty conditionaluserproperty)
	{
		a.h().a(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #183 <Method void cd.a(AppMeasurement$ConditionalUserProperty)>
	//    5   11:return          
	}

	protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionaluserproperty)
	{
		a.h().b(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ax a>
	//    2    4:invokevirtual   #39  <Method cd ax.h()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #186 <Method void cd.b(AppMeasurement$ConditionalUserProperty)>
	//    5   11:return          
	}

	private final ax a;
}
