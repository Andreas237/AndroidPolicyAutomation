// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import java.util.Map;

// Referenced classes of package com.crashlytics.android.answers:
//			SessionEvent, SessionEventMetadata

static class SessionEvent$Builder
{

	public SessionEvent build(SessionEventMetadata sessioneventmetadata)
	{
		return new SessionEvent(sessioneventmetadata, timestamp, type, details, customType, customAttributes, predefinedType, predefinedAttributes, ((SessionEvent._cls1) (null)));
	//    0    0:new             #6   <Class SessionEvent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #35  <Field long timestamp>
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field SessionEvent$Type type>
	//    7   13:aload_0         
	//    8   14:getfield        #37  <Field Map details>
	//    9   17:aload_0         
	//   10   18:getfield        #39  <Field String customType>
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field Map customAttributes>
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field String predefinedType>
	//   15   29:aload_0         
	//   16   30:getfield        #45  <Field Map predefinedAttributes>
	//   17   33:aconst_null     
	//   18   34:invokespecial   #51  <Method void SessionEvent(SessionEventMetadata, long, SessionEvent$Type, Map, String, Map, String, Map, SessionEvent$1)>
	//   19   37:areturn         
	}

	public SessionEvent$Builder customAttributes(Map map)
	{
		customAttributes = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field Map customAttributes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionEvent$Builder customType(String s)
	{
		customType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String customType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionEvent$Builder details(Map map)
	{
		details = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field Map details>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionEvent$Builder predefinedAttributes(Map map)
	{
		predefinedAttributes = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Map predefinedAttributes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public SessionEvent$Builder predefinedType(String s)
	{
		predefinedType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String predefinedType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	Map customAttributes;
	String customType;
	Map details;
	Map predefinedAttributes;
	String predefinedType;
	final long timestamp = System.currentTimeMillis();
	final SessionEvent.Type type;

	public SessionEvent$Builder(SessionEvent.Type type1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		type = type1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field SessionEvent$Type type>
	//    5    9:aload_0         
	//    6   10:invokestatic    #33  <Method long System.currentTimeMillis()>
	//    7   13:putfield        #35  <Field long timestamp>
		details = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #37  <Field Map details>
		customType = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #39  <Field String customType>
		customAttributes = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #41  <Field Map customAttributes>
		predefinedType = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #43  <Field String predefinedType>
		predefinedAttributes = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #45  <Field Map predefinedAttributes>
	//   23   41:return          
	}
}
