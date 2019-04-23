// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.measurement.internal.cp;

public class AppMeasurement$ConditionalUserProperty
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

	public AppMeasurement$ConditionalUserProperty()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public AppMeasurement$ConditionalUserProperty(AppMeasurement$ConditionalUserProperty appmeasurement$conditionaluserproperty)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		am.a(((Object) (appmeasurement$conditionaluserproperty)));
	//    2    4:aload_1         
	//    3    5:invokestatic    #38  <Method Object am.a(Object)>
	//    4    8:pop             
		mAppId = appmeasurement$conditionaluserproperty.mAppId;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #40  <Field String mAppId>
	//    8   14:putfield        #40  <Field String mAppId>
		mOrigin = appmeasurement$conditionaluserproperty.mOrigin;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #42  <Field String mOrigin>
	//   12   22:putfield        #42  <Field String mOrigin>
		mCreationTimestamp = appmeasurement$conditionaluserproperty.mCreationTimestamp;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #44  <Field long mCreationTimestamp>
	//   16   30:putfield        #44  <Field long mCreationTimestamp>
		mName = appmeasurement$conditionaluserproperty.mName;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #46  <Field String mName>
	//   20   38:putfield        #46  <Field String mName>
		Object obj = appmeasurement$conditionaluserproperty.mValue;
	//   21   41:aload_1         
	//   22   42:getfield        #48  <Field Object mValue>
	//   23   45:astore_2        
		if(obj != null)
	//*  24   46:aload_2         
	//*  25   47:ifnull          73
		{
			mValue = cp.a(obj);
	//   26   50:aload_0         
	//   27   51:aload_2         
	//   28   52:invokestatic    #51  <Method Object cp.a(Object)>
	//   29   55:putfield        #48  <Field Object mValue>
			if(mValue == null)
	//*  30   58:aload_0         
	//*  31   59:getfield        #48  <Field Object mValue>
	//*  32   62:ifnonnull       73
				mValue = appmeasurement$conditionaluserproperty.mValue;
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:getfield        #48  <Field Object mValue>
	//   36   70:putfield        #48  <Field Object mValue>
		}
		mActive = appmeasurement$conditionaluserproperty.mActive;
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:getfield        #53  <Field boolean mActive>
	//   40   78:putfield        #53  <Field boolean mActive>
		mTriggerEventName = appmeasurement$conditionaluserproperty.mTriggerEventName;
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:getfield        #55  <Field String mTriggerEventName>
	//   44   86:putfield        #55  <Field String mTriggerEventName>
		mTriggerTimeout = appmeasurement$conditionaluserproperty.mTriggerTimeout;
	//   45   89:aload_0         
	//   46   90:aload_1         
	//   47   91:getfield        #57  <Field long mTriggerTimeout>
	//   48   94:putfield        #57  <Field long mTriggerTimeout>
		mTimedOutEventName = appmeasurement$conditionaluserproperty.mTimedOutEventName;
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:getfield        #59  <Field String mTimedOutEventName>
	//   52  102:putfield        #59  <Field String mTimedOutEventName>
		obj = ((Object) (appmeasurement$conditionaluserproperty.mTimedOutEventParams));
	//   53  105:aload_1         
	//   54  106:getfield        #61  <Field Bundle mTimedOutEventParams>
	//   55  109:astore_2        
		if(obj != null)
	//*  56  110:aload_2         
	//*  57  111:ifnull          126
			mTimedOutEventParams = new Bundle(((Bundle) (obj)));
	//   58  114:aload_0         
	//   59  115:new             #63  <Class Bundle>
	//   60  118:dup             
	//   61  119:aload_2         
	//   62  120:invokespecial   #66  <Method void Bundle(Bundle)>
	//   63  123:putfield        #61  <Field Bundle mTimedOutEventParams>
		mTriggeredEventName = appmeasurement$conditionaluserproperty.mTriggeredEventName;
	//   64  126:aload_0         
	//   65  127:aload_1         
	//   66  128:getfield        #68  <Field String mTriggeredEventName>
	//   67  131:putfield        #68  <Field String mTriggeredEventName>
		obj = ((Object) (appmeasurement$conditionaluserproperty.mTriggeredEventParams));
	//   68  134:aload_1         
	//   69  135:getfield        #70  <Field Bundle mTriggeredEventParams>
	//   70  138:astore_2        
		if(obj != null)
	//*  71  139:aload_2         
	//*  72  140:ifnull          155
			mTriggeredEventParams = new Bundle(((Bundle) (obj)));
	//   73  143:aload_0         
	//   74  144:new             #63  <Class Bundle>
	//   75  147:dup             
	//   76  148:aload_2         
	//   77  149:invokespecial   #66  <Method void Bundle(Bundle)>
	//   78  152:putfield        #70  <Field Bundle mTriggeredEventParams>
		mTriggeredTimestamp = appmeasurement$conditionaluserproperty.mTriggeredTimestamp;
	//   79  155:aload_0         
	//   80  156:aload_1         
	//   81  157:getfield        #72  <Field long mTriggeredTimestamp>
	//   82  160:putfield        #72  <Field long mTriggeredTimestamp>
		mTimeToLive = appmeasurement$conditionaluserproperty.mTimeToLive;
	//   83  163:aload_0         
	//   84  164:aload_1         
	//   85  165:getfield        #74  <Field long mTimeToLive>
	//   86  168:putfield        #74  <Field long mTimeToLive>
		mExpiredEventName = appmeasurement$conditionaluserproperty.mExpiredEventName;
	//   87  171:aload_0         
	//   88  172:aload_1         
	//   89  173:getfield        #76  <Field String mExpiredEventName>
	//   90  176:putfield        #76  <Field String mExpiredEventName>
		appmeasurement$conditionaluserproperty = ((AppMeasurement$ConditionalUserProperty) (appmeasurement$conditionaluserproperty.mExpiredEventParams));
	//   91  179:aload_1         
	//   92  180:getfield        #78  <Field Bundle mExpiredEventParams>
	//   93  183:astore_1        
		if(appmeasurement$conditionaluserproperty != null)
	//*  94  184:aload_1         
	//*  95  185:ifnull          200
			mExpiredEventParams = new Bundle(((Bundle) (appmeasurement$conditionaluserproperty)));
	//   96  188:aload_0         
	//   97  189:new             #63  <Class Bundle>
	//   98  192:dup             
	//   99  193:aload_1         
	//  100  194:invokespecial   #66  <Method void Bundle(Bundle)>
	//  101  197:putfield        #78  <Field Bundle mExpiredEventParams>
	//  102  200:return          
	}
}
