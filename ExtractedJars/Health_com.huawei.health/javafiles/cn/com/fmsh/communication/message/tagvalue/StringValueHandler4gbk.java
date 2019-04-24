// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message.tagvalue;

import java.io.UnsupportedEncodingException;

// Referenced classes of package cn.com.fmsh.communication.message.tagvalue:
//			StringValueHandler

public class StringValueHandler4gbk
	implements StringValueHandler
{

	public StringValueHandler4gbk()
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
		try
		{
			abyte0 = ((byte []) (new String(abyte0, "gbk")));
	//    8   12:new             #17  <Class String>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:ldc1            #19  <String "gbk">
	//   12   19:invokespecial   #22  <Method void String(byte[], String)>
	//   13   22:astore_1        
		}
	//*  14   23:aload_1         
	//*  15   24:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  16   25:astore_1        
		{
			((UnsupportedEncodingException) (abyte0)).printStackTrace();
	//   17   26:aload_1         
	//   18   27:invokevirtual   #25  <Method void UnsupportedEncodingException.printStackTrace()>
			return null;
	//   19   30:aconst_null     
	//   20   31:areturn         
		}
		return ((String) (abyte0));
	}

	public byte[] setTagValue(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		try
		{
			s = ((String) (s.getBytes("gbk")));
	//    4    6:aload_1         
	//    5    7:ldc1            #19  <String "gbk">
	//    6    9:invokevirtual   #30  <Method byte[] String.getBytes(String)>
	//    7   12:astore_1        
		}
	//*   8   13:aload_1         
	//*   9   14:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   15:astore_1        
		{
			((UnsupportedEncodingException) (s)).printStackTrace();
	//   11   16:aload_1         
	//   12   17:invokevirtual   #25  <Method void UnsupportedEncodingException.printStackTrace()>
			return null;
	//   13   20:aconst_null     
	//   14   21:areturn         
		}
		return ((byte []) (s));
	}
}
