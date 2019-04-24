// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;


public class LoginInfo
{

	public LoginInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public int getFailureNum()
	{
		return failureNum;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int failureNum>
	//    2    4:ireturn         
	}

	public byte[] getPatchData()
	{
		return patchData;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field byte[] patchData>
	//    2    4:areturn         
	}

	public int getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int result>
	//    2    4:ireturn         
	}

	public int getUserLockTime()
	{
		return userLockTime;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int userLockTime>
	//    2    4:ireturn         
	}

	public void setFailureNum(int i)
	{
		failureNum = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field int failureNum>
	//    3    5:return          
	}

	public void setPatchData(byte abyte0[])
	{
		patchData = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field byte[] patchData>
	//    3    5:return          
	}

	public void setResult(int i)
	{
		result = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int result>
	//    3    5:return          
	}

	public void setUserLockTime(int i)
	{
		userLockTime = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int userLockTime>
	//    3    5:return          
	}

	int failureNum;
	byte patchData[];
	int result;
	int userLockTime;
}
