// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import java.io.Serializable;

public class UserInfo
	implements Serializable
{

	public UserInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		userName = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #29  <Field String userName>
		password = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #31  <Field String password>
		userType = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #33  <Field int userType>
		mail = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #35  <Field String mail>
		phone = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #37  <Field String phone>
		realName = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #39  <Field String realName>
		certType = -1;
	//   20   34:aload_0         
	//   21   35:iconst_m1       
	//   22   36:putfield        #41  <Field int certType>
		certNo = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #43  <Field String certNo>
		verificationCodeNo = null;
	//   26   44:aload_0         
	//   27   45:aconst_null     
	//   28   46:putfield        #45  <Field byte[] verificationCodeNo>
		verificationCode = null;
	//   29   49:aload_0         
	//   30   50:aconst_null     
	//   31   51:putfield        #47  <Field String verificationCode>
	//   32   54:return          
	}

	public String getCertNo()
	{
		return certNo;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String certNo>
	//    2    4:areturn         
	}

	public int getCertType()
	{
		return certType;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int certType>
	//    2    4:ireturn         
	}

	public String getMail()
	{
		return mail;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mail>
	//    2    4:areturn         
	}

	public String getPassword()
	{
		return password;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String password>
	//    2    4:areturn         
	}

	public String getPhone()
	{
		return phone;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String phone>
	//    2    4:areturn         
	}

	public String getRealName()
	{
		return realName;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String realName>
	//    2    4:areturn         
	}

	public String getUserName()
	{
		return userName;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String userName>
	//    2    4:areturn         
	}

	public int getUserType()
	{
		return userType;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int userType>
	//    2    4:ireturn         
	}

	public String getVerificationCode()
	{
		return verificationCode;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String verificationCode>
	//    2    4:areturn         
	}

	public byte[] getVerificationCodeNo()
	{
		return verificationCodeNo;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field byte[] verificationCodeNo>
	//    2    4:areturn         
	}

	public void setCertNo(String s)
	{
		certNo = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field String certNo>
	//    3    5:return          
	}

	public void setCertType(int i)
	{
		certType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int certType>
	//    3    5:return          
	}

	public void setMail(String s)
	{
		mail = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field String mail>
	//    3    5:return          
	}

	public void setPassword(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String password>
	//    3    5:return          
	}

	public void setPhone(String s)
	{
		phone = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String phone>
	//    3    5:return          
	}

	public void setRealName(String s)
	{
		realName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String realName>
	//    3    5:return          
	}

	public void setUserName(String s)
	{
		userName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String userName>
	//    3    5:return          
	}

	public void setUserType(int i)
	{
		userType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #33  <Field int userType>
	//    3    5:return          
	}

	public void setVerificationCode(String s)
	{
		verificationCode = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String verificationCode>
	//    3    5:return          
	}

	public void setVerificationCodeNo(byte abyte0[])
	{
		verificationCodeNo = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field byte[] verificationCodeNo>
	//    3    5:return          
	}

	private static final long serialVersionUID = 1L;
	String certNo;
	int certType;
	String mail;
	String password;
	String phone;
	String realName;
	String userName;
	int userType;
	String verificationCode;
	byte verificationCodeNo[];
}
