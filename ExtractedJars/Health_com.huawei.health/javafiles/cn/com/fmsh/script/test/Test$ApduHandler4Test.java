// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.test;

import cn.com.fmsh.script.ApduHandler;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.util.FM_Bytes;
import java.io.PrintStream;

// Referenced classes of package cn.com.fmsh.script.test:
//			Test

class Test$ApduHandler4Test
	implements ApduHandler
{

	public void close()
	{
	//    0    0:return          
	}

	public boolean connect()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public cn.com.fmsh.script.rType getApduHandlerType()
	{
		return cn.com.fmsh.script.rType.OPEN_MOBILE;
	//    0    0:getstatic       #33  <Field cn.com.fmsh.script.ApduHandler$ApduHandlerType cn.com.fmsh.script.ApduHandler$ApduHandlerType.OPEN_MOBILE>
	//    1    3:areturn         
	}

	public boolean isConnect()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean open(byte abyte0[])
	{
		System.out.println((new StringBuilder("open aid:")).append(FM_Bytes.bytesToHexString(abyte0)).toString());
	//    0    0:getstatic       #42  <Field PrintStream System.out>
	//    1    3:new             #44  <Class StringBuilder>
	//    2    6:dup             
	//    3    7:ldc1            #46  <String "open aid:">
	//    4    9:invokespecial   #49  <Method void StringBuilder(String)>
	//    5   12:aload_1         
	//    6   13:invokestatic    #55  <Method String FM_Bytes.bytesToHexString(byte[])>
	//    7   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #63  <Method String StringBuilder.toString()>
	//    9   22:invokevirtual   #68  <Method void PrintStream.println(String)>
		return true;
	//   10   25:iconst_1        
	//   11   26:ireturn         
	}

	public byte[] transceive(byte abyte0[])
		throws FMScriptHandleException
	{
		abyte0 = new byte[2];
	//    0    0:iconst_2        
	//    1    1:newarray        byte[]
	//    2    3:astore_1        
		abyte0[0] = -112;
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:bipush          -112
	//    6    8:bastore         
		return abyte0;
	//    7    9:aload_1         
	//    8   10:areturn         
	}

	final Test this$0;

	private Test$ApduHandler4Test()
	{
		this$0 = Test.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Test this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	Test$ApduHandler4Test(Test$ApduHandler4Test test$apduhandler4test)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void Test$ApduHandler4Test(Test)>
	//    3    5:return          
	}
}
