// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.tagvalue;


// Referenced classes of package cn.com.fmsh.communication.message.tagvalue:
//			StringValueHandler

public class StringValueHandler4asc
	implements StringValueHandler
{

	public StringValueHandler4asc()
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
			return new String(abyte0);
	//    8   12:new             #15  <Class String>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokespecial   #18  <Method void String(byte[])>
	//   12   20:areturn         
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
			return s.getBytes();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #24  <Method byte[] String.getBytes()>
	//    6   10:areturn         
	}
}
