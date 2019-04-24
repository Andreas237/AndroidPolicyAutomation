// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.tagvalue;

import cn.com.fmsh.util.FM_CN;

// Referenced classes of package cn.com.fmsh.communication.message.tagvalue:
//			StringValueHandler

public class StringValueHandler4cn
	implements StringValueHandler
{

	public StringValueHandler4cn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public String getTagvalue(byte abyte0[])
	{
		if(abyte0 == null || abyte0.length < 1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:iconst_1        
	//*   5    7:icmpge          12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return FM_CN.bcdBytesToString(abyte0);
	//    8   12:aload_1         
	//    9   13:invokestatic    #18  <Method String FM_CN.bcdBytesToString(byte[])>
	//   10   16:areturn         
	}

	public byte[] setTagValue(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return FM_CN.string2Bcd(s);
	//    4    6:aload_1         
	//    5    7:invokestatic    #23  <Method byte[] FM_CN.string2Bcd(String)>
	//    6   10:areturn         
	}
}
