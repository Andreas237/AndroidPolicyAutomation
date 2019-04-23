// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zza;
import com.google.android.gms.measurement.internal.zzbw;
import com.google.android.gms.measurement.internal.zzcu;
import com.google.android.gms.measurement.internal.zzcv;
import com.google.android.gms.measurement.internal.zzcw;
import com.google.android.gms.measurement.internal.zzcx;
import com.google.android.gms.measurement.internal.zzcy;
import com.google.android.gms.measurement.internal.zzda;
import com.google.android.gms.measurement.internal.zzdw;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzfy;
import java.util.*;

public class AppMeasurement
{
	public static class ConditionalUserProperty
	{

		public boolean mActive;
		public String mAppId;
		public long mCreationTimestamp;
		public String mExpiredEventName;
		public Bundle mExpiredEventParams;
		public String mName;
		public String mOrigin;
		public long mTimeToLive;
		public String mTimedOutEventName;
		public Bundle mTimedOutEventParams;
		public String mTriggerEventName;
		public long mTriggerTimeout;
		public String mTriggeredEventName;
		public Bundle mTriggeredEventParams;
		public long mTriggeredTimestamp;
		public Object mValue;

		public ConditionalUserProperty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
		//    2    4:return          
		}

		public ConditionalUserProperty(ConditionalUserProperty conditionaluserproperty)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
			Preconditions.checkNotNull(((Object) (conditionaluserproperty)));
		//    2    4:aload_1         
		//    3    5:invokestatic    #43  <Method Object Preconditions.checkNotNull(Object)>
		//    4    8:pop             
			mAppId = conditionaluserproperty.mAppId;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #45  <Field String mAppId>
		//    8   14:putfield        #45  <Field String mAppId>
			mOrigin = conditionaluserproperty.mOrigin;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #47  <Field String mOrigin>
		//   12   22:putfield        #47  <Field String mOrigin>
			mCreationTimestamp = conditionaluserproperty.mCreationTimestamp;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #49  <Field long mCreationTimestamp>
		//   16   30:putfield        #49  <Field long mCreationTimestamp>
			mName = conditionaluserproperty.mName;
		//   17   33:aload_0         
		//   18   34:aload_1         
		//   19   35:getfield        #51  <Field String mName>
		//   20   38:putfield        #51  <Field String mName>
			Object obj = conditionaluserproperty.mValue;
		//   21   41:aload_1         
		//   22   42:getfield        #53  <Field Object mValue>
		//   23   45:astore_2        
			if(obj != null)
		//*  24   46:aload_2         
		//*  25   47:ifnull          73
			{
				mValue = zzdw.zze(obj);
		//   26   50:aload_0         
		//   27   51:aload_2         
		//   28   52:invokestatic    #58  <Method Object zzdw.zze(Object)>
		//   29   55:putfield        #53  <Field Object mValue>
				if(mValue == null)
		//*  30   58:aload_0         
		//*  31   59:getfield        #53  <Field Object mValue>
		//*  32   62:ifnonnull       73
					mValue = conditionaluserproperty.mValue;
		//   33   65:aload_0         
		//   34   66:aload_1         
		//   35   67:getfield        #53  <Field Object mValue>
		//   36   70:putfield        #53  <Field Object mValue>
			}
			mActive = conditionaluserproperty.mActive;
		//   37   73:aload_0         
		//   38   74:aload_1         
		//   39   75:getfield        #60  <Field boolean mActive>
		//   40   78:putfield        #60  <Field boolean mActive>
			mTriggerEventName = conditionaluserproperty.mTriggerEventName;
		//   41   81:aload_0         
		//   42   82:aload_1         
		//   43   83:getfield        #62  <Field String mTriggerEventName>
		//   44   86:putfield        #62  <Field String mTriggerEventName>
			mTriggerTimeout = conditionaluserproperty.mTriggerTimeout;
		//   45   89:aload_0         
		//   46   90:aload_1         
		//   47   91:getfield        #64  <Field long mTriggerTimeout>
		//   48   94:putfield        #64  <Field long mTriggerTimeout>
			mTimedOutEventName = conditionaluserproperty.mTimedOutEventName;
		//   49   97:aload_0         
		//   50   98:aload_1         
		//   51   99:getfield        #66  <Field String mTimedOutEventName>
		//   52  102:putfield        #66  <Field String mTimedOutEventName>
			obj = ((Object) (conditionaluserproperty.mTimedOutEventParams));
		//   53  105:aload_1         
		//   54  106:getfield        #68  <Field Bundle mTimedOutEventParams>
		//   55  109:astore_2        
			if(obj != null)
		//*  56  110:aload_2         
		//*  57  111:ifnull          126
				mTimedOutEventParams = new Bundle(((Bundle) (obj)));
		//   58  114:aload_0         
		//   59  115:new             #70  <Class Bundle>
		//   60  118:dup             
		//   61  119:aload_2         
		//   62  120:invokespecial   #73  <Method void Bundle(Bundle)>
		//   63  123:putfield        #68  <Field Bundle mTimedOutEventParams>
			mTriggeredEventName = conditionaluserproperty.mTriggeredEventName;
		//   64  126:aload_0         
		//   65  127:aload_1         
		//   66  128:getfield        #75  <Field String mTriggeredEventName>
		//   67  131:putfield        #75  <Field String mTriggeredEventName>
			obj = ((Object) (conditionaluserproperty.mTriggeredEventParams));
		//   68  134:aload_1         
		//   69  135:getfield        #77  <Field Bundle mTriggeredEventParams>
		//   70  138:astore_2        
			if(obj != null)
		//*  71  139:aload_2         
		//*  72  140:ifnull          155
				mTriggeredEventParams = new Bundle(((Bundle) (obj)));
		//   73  143:aload_0         
		//   74  144:new             #70  <Class Bundle>
		//   75  147:dup             
		//   76  148:aload_2         
		//   77  149:invokespecial   #73  <Method void Bundle(Bundle)>
		//   78  152:putfield        #77  <Field Bundle mTriggeredEventParams>
			mTriggeredTimestamp = conditionaluserproperty.mTriggeredTimestamp;
		//   79  155:aload_0         
		//   80  156:aload_1         
		//   81  157:getfield        #79  <Field long mTriggeredTimestamp>
		//   82  160:putfield        #79  <Field long mTriggeredTimestamp>
			mTimeToLive = conditionaluserproperty.mTimeToLive;
		//   83  163:aload_0         
		//   84  164:aload_1         
		//   85  165:getfield        #81  <Field long mTimeToLive>
		//   86  168:putfield        #81  <Field long mTimeToLive>
			mExpiredEventName = conditionaluserproperty.mExpiredEventName;
		//   87  171:aload_0         
		//   88  172:aload_1         
		//   89  173:getfield        #83  <Field String mExpiredEventName>
		//   90  176:putfield        #83  <Field String mExpiredEventName>
			conditionaluserproperty = ((ConditionalUserProperty) (conditionaluserproperty.mExpiredEventParams));
		//   91  179:aload_1         
		//   92  180:getfield        #85  <Field Bundle mExpiredEventParams>
		//   93  183:astore_1        
			if(conditionaluserproperty != null)
		//*  94  184:aload_1         
		//*  95  185:ifnull          200
				mExpiredEventParams = new Bundle(((Bundle) (conditionaluserproperty)));
		//   96  188:aload_0         
		//   97  189:new             #70  <Class Bundle>
		//   98  192:dup             
		//   99  193:aload_1         
		//  100  194:invokespecial   #73  <Method void Bundle(Bundle)>
		//  101  197:putfield        #85  <Field Bundle mExpiredEventParams>
		//  102  200:return          
		}
	}

	public static final class Event extends zzcu
	{

		public static final String AD_REWARD = "_ar";
		public static final String APP_EXCEPTION = "_ae";

		private Event()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void zzcu()>
		//    2    4:return          
		}
	}

	public static interface EventInterceptor
		extends zzcx
	{

		public abstract void interceptEvent(String s, String s1, Bundle bundle, long l);
	}

	public static interface OnEventListener
		extends zzcy
	{

		public abstract void onEvent(String s, String s1, Bundle bundle, long l);
	}

	public static final class Param extends zzcv
	{

		public static final String FATAL = "fatal";
		public static final String TIMESTAMP = "timestamp";
		public static final String TYPE = "type";

		private Param()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void zzcv()>
		//    2    4:return          
		}
	}

	public static final class UserProperty extends zzcw
	{

		public static final String FIREBASE_LAST_NOTIFICATION = "_ln";

		private UserProperty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void zzcw()>
		//    2    4:return          
		}
	}


	public AppMeasurement(zzbw zzbw1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		Preconditions.checkNotNull(((Object) (zzbw1)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #48  <Method Object Preconditions.checkNotNull(Object)>
	//    4    8:pop             
		zzada = zzbw1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #50  <Field zzbw zzada>
	//    8   14:return          
	}

	public static AppMeasurement getInstance(Context context)
	{
		return zzbw.zza(context, ((com.google.android.gms.measurement.internal.zzan) (null))).zzkm();
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #65  <Method zzbw zzbw.zza(Context, com.google.android.gms.measurement.internal.zzan)>
	//    3    5:invokevirtual   #69  <Method AppMeasurement zzbw.zzkm()>
	//    4    8:areturn         
	}

	public void beginAdUnitExposure(String s)
	{
		zzada.zzgi().beginAdUnitExposure(s, zzada.zzbx().elapsedRealtime());
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #82  <Method zza zzbw.zzgi()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field zzbw zzada>
	//    6   12:invokevirtual   #86  <Method Clock zzbw.zzbx()>
	//    7   15:invokeinterface #92  <Method long Clock.elapsedRealtime()>
	//    8   20:invokevirtual   #97  <Method void zza.beginAdUnitExposure(String, long)>
	//    9   23:return          
	}

	public void clearConditionalUserProperty(String s, String s1, Bundle bundle)
	{
		zzada.zzgj().clearConditionalUserProperty(s, s1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #112 <Method void zzda.clearConditionalUserProperty(String, String, Bundle)>
	//    7   13:return          
	}

	protected void clearConditionalUserPropertyAs(String s, String s1, String s2, Bundle bundle)
	{
		zzada.zzgj().clearConditionalUserPropertyAs(s, s1, s2, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokevirtual   #117 <Method void zzda.clearConditionalUserPropertyAs(String, String, String, Bundle)>
	//    8   15:return          
	}

	public void endAdUnitExposure(String s)
	{
		zzada.zzgi().endAdUnitExposure(s, zzada.zzbx().elapsedRealtime());
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #82  <Method zza zzbw.zzgi()>
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #50  <Field zzbw zzada>
	//    6   12:invokevirtual   #86  <Method Clock zzbw.zzbx()>
	//    7   15:invokeinterface #92  <Method long Clock.elapsedRealtime()>
	//    8   20:invokevirtual   #120 <Method void zza.endAdUnitExposure(String, long)>
	//    9   23:return          
	}

	public long generateEventId()
	{
		return zzada.zzgr().zzmj();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #125 <Method zzfy zzbw.zzgr()>
	//    3    7:invokevirtual   #130 <Method long zzfy.zzmj()>
	//    4   10:lreturn         
	}

	public String getAppInstanceId()
	{
		return zzada.zzgj().zzgc();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #135 <Method String zzda.zzgc()>
	//    4   10:areturn         
	}

	public Boolean getBoolean()
	{
		return zzada.zzgj().zzkx();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #140 <Method Boolean zzda.zzkx()>
	//    4   10:areturn         
	}

	public List getConditionalUserProperties(String s, String s1)
	{
		return zzada.zzgj().getConditionalUserProperties(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #147 <Method List zzda.getConditionalUserProperties(String, String)>
	//    6   12:areturn         
	}

	protected List getConditionalUserPropertiesAs(String s, String s1, String s2)
	{
		return zzada.zzgj().getConditionalUserPropertiesAs(s, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #153 <Method List zzda.getConditionalUserPropertiesAs(String, String, String)>
	//    7   13:areturn         
	}

	public String getCurrentScreenClass()
	{
		return zzada.zzgj().getCurrentScreenClass();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #157 <Method String zzda.getCurrentScreenClass()>
	//    4   10:areturn         
	}

	public String getCurrentScreenName()
	{
		return zzada.zzgj().getCurrentScreenName();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #160 <Method String zzda.getCurrentScreenName()>
	//    4   10:areturn         
	}

	public Double getDouble()
	{
		return zzada.zzgj().zzlb();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #165 <Method Double zzda.zzlb()>
	//    4   10:areturn         
	}

	public String getGmpAppId()
	{
		return zzada.zzgj().getGmpAppId();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #168 <Method String zzda.getGmpAppId()>
	//    4   10:areturn         
	}

	public Integer getInteger()
	{
		return zzada.zzgj().zzla();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #173 <Method Integer zzda.zzla()>
	//    4   10:areturn         
	}

	public Long getLong()
	{
		return zzada.zzgj().zzkz();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #178 <Method Long zzda.zzkz()>
	//    4   10:areturn         
	}

	public int getMaxUserProperties(String s)
	{
		zzada.zzgj();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:pop             
		Preconditions.checkNotEmpty(s);
	//    4    8:aload_1         
	//    5    9:invokestatic    #184 <Method String Preconditions.checkNotEmpty(String)>
	//    6   12:pop             
		return 25;
	//    7   13:bipush          25
	//    8   15:ireturn         
	}

	public String getString()
	{
		return zzada.zzgj().zzky();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:invokevirtual   #188 <Method String zzda.zzky()>
	//    4   10:areturn         
	}

	protected Map getUserProperties(String s, String s1, boolean flag)
	{
		return zzada.zzgj().getUserProperties(s, s1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #192 <Method Map zzda.getUserProperties(String, String, boolean)>
	//    7   13:areturn         
	}

	public Map getUserProperties(boolean flag)
	{
		Object obj = ((Object) (zzada.zzgj().zzk(flag)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #198 <Method List zzda.zzk(boolean)>
	//    5   11:astore_3        
		ArrayMap arraymap = new ArrayMap(((List) (obj)).size());
	//    6   12:new             #200 <Class ArrayMap>
	//    7   15:dup             
	//    8   16:aload_3         
	//    9   17:invokeinterface #206 <Method int List.size()>
	//   10   22:invokespecial   #209 <Method void ArrayMap(int)>
	//   11   25:astore_2        
		zzfv zzfv1;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); ((Map) (arraymap)).put(((Object) (zzfv1.name)), zzfv1.getValue()))
	//*  12   26:aload_3         
	//*  13   27:invokeinterface #213 <Method Iterator List.iterator()>
	//*  14   32:astore_3        
	//*  15   33:aload_3         
	//*  16   34:invokeinterface #219 <Method boolean Iterator.hasNext()>
	//*  17   39:ifeq            73
			zzfv1 = (zzfv)((Iterator) (obj)).next();
	//   18   42:aload_3         
	//   19   43:invokeinterface #223 <Method Object Iterator.next()>
	//   20   48:checkcast       #225 <Class zzfv>
	//   21   51:astore          4

	//   22   53:aload_2         
	//   23   54:aload           4
	//   24   56:getfield        #228 <Field String zzfv.name>
	//   25   59:aload           4
	//   26   61:invokevirtual   #231 <Method Object zzfv.getValue()>
	//   27   64:invokeinterface #237 <Method Object Map.put(Object, Object)>
	//   28   69:pop             
	//*  29   70:goto            33
		return ((Map) (arraymap));
	//   30   73:aload_2         
	//   31   74:areturn         
	}

	protected Map getUserPropertiesAs(String s, String s1, String s2, boolean flag)
	{
		return zzada.zzgj().getUserPropertiesAs(s, s1, s2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #242 <Method Map zzda.getUserPropertiesAs(String, String, String, boolean)>
	//    8   15:areturn         
	}

	public final void logEvent(String s, Bundle bundle)
	{
		zzada.zzgj().zza("app", s, bundle, true);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:ldc1            #249 <String "app">
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #252 <Method void zzda.zza(String, String, Bundle, boolean)>
	//    8   15:return          
	}

	public void logEventInternal(String s, String s1, Bundle bundle)
	{
		zzada.zzgj().logEvent(s, s1, bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #255 <Method void zzda.logEvent(String, String, Bundle)>
	//    7   13:return          
	}

	public void logEventInternalNoInterceptor(String s, String s1, Bundle bundle, long l)
	{
		zzada.zzgj().logEvent(s, s1, bundle, true, false, l);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:iconst_1        
	//    7   11:iconst_0        
	//    8   12:lload           4
	//    9   14:invokevirtual   #260 <Method void zzda.logEvent(String, String, Bundle, boolean, boolean, long)>
	//   10   17:return          
	}

	public void registerOnMeasurementEventListener(OnEventListener oneventlistener)
	{
		zzada.zzgj().zza(((zzcy) (oneventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #265 <Method void zzda.zza(zzcy)>
	//    5   11:return          
	}

	public void setConditionalUserProperty(ConditionalUserProperty conditionaluserproperty)
	{
		zzada.zzgj().setConditionalUserProperty(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #269 <Method void zzda.setConditionalUserProperty(AppMeasurement$ConditionalUserProperty)>
	//    5   11:return          
	}

	protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionaluserproperty)
	{
		zzada.zzgj().setConditionalUserPropertyAs(conditionaluserproperty);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #272 <Method void zzda.setConditionalUserPropertyAs(AppMeasurement$ConditionalUserProperty)>
	//    5   11:return          
	}

	public void setEventInterceptor(EventInterceptor eventinterceptor)
	{
		zzada.zzgj().zza(((zzcx) (eventinterceptor)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #277 <Method void zzda.zza(zzcx)>
	//    5   11:return          
	}

	public void setMeasurementEnabled(boolean flag)
	{
		zzada.zzgj().setMeasurementEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #281 <Method void zzda.setMeasurementEnabled(boolean)>
	//    5   11:return          
	}

	public final void setMinimumSessionDuration(long l)
	{
		zzada.zzgj().setMinimumSessionDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:lload_1         
	//    4    8:invokevirtual   #285 <Method void zzda.setMinimumSessionDuration(long)>
	//    5   11:return          
	}

	public final void setSessionTimeoutDuration(long l)
	{
		zzada.zzgj().setSessionTimeoutDuration(l);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:lload_1         
	//    4    8:invokevirtual   #288 <Method void zzda.setSessionTimeoutDuration(long)>
	//    5   11:return          
	}

	public final void setUserProperty(String s, String s1)
	{
		zzada.zzgj().zzb("app", s, ((Object) (s1)), false);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:ldc1            #249 <String "app">
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:iconst_0        
	//    7   12:invokevirtual   #296 <Method void zzda.zzb(String, String, Object, boolean)>
	//    8   15:return          
	}

	public void setUserPropertyInternal(String s, String s1, Object obj)
	{
		Preconditions.checkNotEmpty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #184 <Method String Preconditions.checkNotEmpty(String)>
	//    2    4:pop             
		zzada.zzgj().zzb(s, s1, obj, true);
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field zzbw zzada>
	//    5    9:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #296 <Method void zzda.zzb(String, String, Object, boolean)>
	//   11   19:return          
	}

	public void unregisterOnMeasurementEventListener(OnEventListener oneventlistener)
	{
		zzada.zzgj().zzb(((zzcy) (oneventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #301 <Method void zzda.zzb(zzcy)>
	//    5   11:return          
	}

	public final void zzd(boolean flag)
	{
		zzada.zzgj().zzd(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field zzbw zzada>
	//    2    4:invokevirtual   #108 <Method zzda zzbw.zzgj()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #304 <Method void zzda.zzd(boolean)>
	//    5   11:return          
	}

	public static final String CRASH_ORIGIN = "crash";
	public static final String FCM_ORIGIN = "fcm";
	public static final String FIAM_ORIGIN = "fiam";
	private final zzbw zzada;
}
