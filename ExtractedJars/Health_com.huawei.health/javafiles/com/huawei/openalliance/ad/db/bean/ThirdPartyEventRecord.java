// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.db.bean;


// Referenced classes of package com.huawei.openalliance.ad.db.bean:
//			RecordBean, EncryptionField

public class ThirdPartyEventRecord extends RecordBean
{

	public ThirdPartyEventRecord()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void RecordBean()>
		lockTime = 0L;
	//    2    4:aload_0         
	//    3    5:lconst_0        
	//    4    6:putfield        #27  <Field long lockTime>
	//    5    9:return          
	}

	public ThirdPartyEventRecord(int i, String s)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void ThirdPartyEventRecord()>
		adType = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int adType>
		setUrl(s);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #36  <Method void setUrl(String)>
		time = System.currentTimeMillis();
	//    8   14:aload_0         
	//    9   15:invokestatic    #42  <Method long System.currentTimeMillis()>
	//   10   18:putfield        #44  <Field long time>
	//   11   21:return          
	}

	public int getAdType()
	{
		return adType;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int adType>
	//    2    4:ireturn         
	}

	public long getLockTime()
	{
		return lockTime;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field long lockTime>
	//    2    4:lreturn         
	}

	public long getTime()
	{
		return time;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long time>
	//    2    4:lreturn         
	}

	public EncryptionField getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field EncryptionField url>
	//    2    4:areturn         
	}

	public String get_id()
	{
		return _id;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String _id>
	//    2    4:areturn         
	}

	public void setAdType(int i)
	{
		adType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int adType>
	//    3    5:return          
	}

	public void setLockTime(long l)
	{
		lockTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #27  <Field long lockTime>
	//    3    5:return          
	}

	public void setTime(long l)
	{
		time = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #44  <Field long time>
	//    3    5:return          
	}

	public void setUrl(String s)
	{
		if(url == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field EncryptionField url>
	//*   2    4:ifnonnull       20
			url = new EncryptionField(java/lang/String);
	//    3    7:aload_0         
	//    4    8:new             #65  <Class EncryptionField>
	//    5   11:dup             
	//    6   12:ldc1            #67  <Class String>
	//    7   14:invokespecial   #70  <Method void EncryptionField(Class)>
	//    8   17:putfield        #52  <Field EncryptionField url>
		url.setOriginalField(((Object) (s)));
	//    9   20:aload_0         
	//   10   21:getfield        #52  <Field EncryptionField url>
	//   11   24:aload_1         
	//   12   25:invokevirtual   #74  <Method void EncryptionField.setOriginalField(Object)>
	//   13   28:return          
	}

	public void setUrl_(EncryptionField encryptionfield)
	{
		url = encryptionfield;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field EncryptionField url>
	//    3    5:return          
	}

	public void set_id(String s)
	{
		_id = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field String _id>
	//    3    5:return          
	}

	public static final String AD_TYPE = "adType";
	public static final String LOCK_TIME = "lockTime";
	public static final String TIME = "time";
	private String _id;
	private int adType;
	private long lockTime;
	private long time;
	private EncryptionField url;
}
