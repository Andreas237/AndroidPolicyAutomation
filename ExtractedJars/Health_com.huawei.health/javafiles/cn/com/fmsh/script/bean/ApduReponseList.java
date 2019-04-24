// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.MessageHandleFactory;
import cn.com.fmsh.communication.message.core.MessageHandler;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.FM_Bytes;
import java.io.PrintStream;
import java.util.*;

// Referenced classes of package cn.com.fmsh.script.bean:
//			ApduResponse

public class ApduReponseList
{

	public ApduReponseList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		list = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List list>
	//    7   15:return          
	}

	public static void main(String args[])
	{
		byte abyte0[] = FM_Bytes.hexStringToBytes("6985");
	//    0    0:ldc1            #21  <String "6985">
	//    1    2:invokestatic    #27  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:astore_1        
		args = ((String []) (new ApduResponse()));
	//    3    6:new             #29  <Class ApduResponse>
	//    4    9:dup             
	//    5   10:invokespecial   #30  <Method void ApduResponse()>
	//    6   13:astore_0        
		((ApduResponse) (args)).setResult(abyte0);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #34  <Method void ApduResponse.setResult(byte[])>
		((ApduResponse) (args)).setId(1);
	//   10   19:aload_0         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #38  <Method void ApduResponse.setId(int)>
		ApduReponseList apdureponselist = new ApduReponseList();
	//   13   24:new             #2   <Class ApduReponseList>
	//   14   27:dup             
	//   15   28:invokespecial   #39  <Method void ApduReponseList()>
	//   16   31:astore_1        
		apdureponselist.add(((ApduResponse) (args)));
	//   17   32:aload_1         
	//   18   33:aload_0         
	//   19   34:invokevirtual   #43  <Method void add(ApduResponse)>
		System.out.println(FM_Bytes.bytesToHexString(apdureponselist.toBytes4A2()));
	//   20   37:getstatic       #49  <Field PrintStream System.out>
	//   21   40:aload_1         
	//   22   41:invokevirtual   #53  <Method byte[] toBytes4A2()>
	//   23   44:invokestatic    #57  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   24   47:invokevirtual   #63  <Method void PrintStream.println(String)>
		System.out.println(FM_Bytes.bytesToHexString(apdureponselist.toBytes4A3()));
	//   25   50:getstatic       #49  <Field PrintStream System.out>
	//   26   53:aload_1         
	//   27   54:invokevirtual   #66  <Method byte[] toBytes4A3()>
	//   28   57:invokestatic    #57  <Method String FM_Bytes.bytesToHexString(byte[])>
	//   29   60:invokevirtual   #63  <Method void PrintStream.println(String)>
	//   30   63:return          
	}

	public void add(ApduResponse apduresponse)
	{
		list.add(((Object) (apduresponse)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List list>
	//    2    4:aload_1         
	//    3    5:invokeinterface #71  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public ApduResponse[] getApduResponse()
	{
		ApduResponse aapduresponse[] = new ApduResponse[list.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List list>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:anewarray       ApduResponse[]
	//    4   12:astore_1        
		return (ApduResponse[])list.toArray(((Object []) (aapduresponse)));
	//    5   13:aload_0         
	//    6   14:getfield        #16  <Field List list>
	//    7   17:aload_1         
	//    8   18:invokeinterface #81  <Method Object[] List.toArray(Object[])>
	//    9   23:checkcast       #83  <Class ApduResponse[]>
	//   10   26:areturn         
	}

	public List getApduResponseList()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #16  <Field List list>
	//*   6   12:invokeinterface #89  <Method Iterator List.iterator()>
	//*   7   17:astore_2        
	//*   8   18:goto            46
		{
			ApduResponse apduresponse = (ApduResponse)iterator.next();
	//    9   21:aload_2         
	//   10   22:invokeinterface #95  <Method Object Iterator.next()>
	//   11   27:checkcast       #29  <Class ApduResponse>
	//   12   30:astore_3        
			if(apduresponse != null)
	//*  13   31:aload_3         
	//*  14   32:ifnull          46
				((List) (arraylist)).add(((Object) (apduresponse.getResult())));
	//   15   35:aload_1         
	//   16   36:aload_3         
	//   17   37:invokevirtual   #98  <Method byte[] ApduResponse.getResult()>
	//   18   40:invokeinterface #71  <Method boolean List.add(Object)>
	//   19   45:pop             
		}

	//   20   46:aload_2         
	//   21   47:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   22   52:ifne            21
		return ((List) (arraylist));
	//   23   55:aload_1         
	//   24   56:areturn         
	}

	public ApduResponse[] getApduResponses()
	{
		return (ApduResponse[])list.toArray(((Object []) (new ApduResponse[0])));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List list>
	//    2    4:iconst_0        
	//    3    5:anewarray       ApduResponse[]
	//    4    8:invokeinterface #81  <Method Object[] List.toArray(Object[])>
	//    5   13:checkcast       #83  <Class ApduResponse[]>
	//    6   16:areturn         
	}

	public int size()
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List list>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ireturn         
	}

	public byte[] toBytes4A2()
	{
		if(list.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field List list>
	//*   2    4:invokeinterface #77  <Method int List.size()>
	//*   3    9:ifle            29
			return ((ApduResponse)list.get(0)).toBytes();
	//    4   12:aload_0         
	//    5   13:getfield        #16  <Field List list>
	//    6   16:iconst_0        
	//    7   17:invokeinterface #109 <Method Object List.get(int)>
	//    8   22:checkcast       #29  <Class ApduResponse>
	//    9   25:invokevirtual   #112 <Method byte[] ApduResponse.toBytes()>
	//   10   28:areturn         
		else
			return null;
	//   11   29:aconst_null     
	//   12   30:areturn         
	}

	public byte[] toBytes4A3()
	{
		byte abyte0[] = new byte[0];
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*   3    4:aload_0         
	//*   4    5:getfield        #16  <Field List list>
	//*   5    8:invokeinterface #89  <Method Iterator List.iterator()>
	//*   6   13:astore          4
	//*   7   15:goto            45
		{
			ApduResponse apduresponse = (ApduResponse)iterator.next();
	//    8   18:aload           4
	//    9   20:invokeinterface #95  <Method Object Iterator.next()>
	//   10   25:checkcast       #29  <Class ApduResponse>
	//   11   28:astore          5
			if(apduresponse != null)
	//*  12   30:aload           5
	//*  13   32:ifnull          45
				abyte0 = FM_Bytes.join(abyte0, apduresponse.toBytes());
	//   14   35:aload_3         
	//   15   36:aload           5
	//   16   38:invokevirtual   #112 <Method byte[] ApduResponse.toBytes()>
	//   17   41:invokestatic    #116 <Method byte[] FM_Bytes.join(byte[], byte[])>
	//   18   44:astore_3        
		}

	//   19   45:aload           4
	//   20   47:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   21   52:ifne            18
		int j = abyte0.length;
	//   22   55:aload_3         
	//   23   56:arraylength     
	//   24   57:istore_2        
		byte abyte1[] = new byte[j + 2];
	//   25   58:iload_2         
	//   26   59:iconst_2        
	//   27   60:iadd            
	//   28   61:newarray        byte[]
	//   29   63:astore          4
		abyte1[0] = -93;
	//   30   65:aload           4
	//   31   67:iconst_0        
	//   32   68:bipush          -93
	//   33   70:bastore         
		abyte1[1] = (byte)j;
	//   34   71:aload           4
	//   35   73:iconst_1        
	//   36   74:iload_2         
	//   37   75:int2byte        
	//   38   76:bastore         
		for(int i = 0; i < j; i++)
	//*  39   77:iconst_0        
	//*  40   78:istore_1        
	//*  41   79:goto            95
			abyte1[i + 2] = abyte0[i];
	//   42   82:aload           4
	//   43   84:iload_1         
	//   44   85:iconst_2        
	//   45   86:iadd            
	//   46   87:aload_3         
	//   47   88:iload_1         
	//   48   89:baload          
	//   49   90:bastore         

	//   50   91:iload_1         
	//   51   92:iconst_1        
	//   52   93:iadd            
	//   53   94:istore_1        
	//   54   95:iload_1         
	//   55   96:iload_2         
	//   56   97:icmplt          82
		return abyte1;
	//   57  100:aload           4
	//   58  102:areturn         
	}

	public ITag toTag4A2()
		throws FMCommunicationMessageException
	{
		MessageHandler messagehandler = MessageHandleFactory.getMessageHandler();
	//    0    0:invokestatic    #126 <Method MessageHandler MessageHandleFactory.getMessageHandler()>
	//    1    3:astore_1        
		if(list.size() > 0)
	//*   2    4:aload_0         
	//*   3    5:getfield        #16  <Field List list>
	//*   4    8:invokeinterface #77  <Method int List.size()>
	//*   5   13:ifle            37
			return ((ITag) (messagehandler.createTag(((ApduResponse)list.get(0)).toBytes())));
	//    6   16:aload_1         
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field List list>
	//    9   21:iconst_0        
	//   10   22:invokeinterface #109 <Method Object List.get(int)>
	//   11   27:checkcast       #29  <Class ApduResponse>
	//   12   30:invokevirtual   #112 <Method byte[] ApduResponse.toBytes()>
	//   13   33:invokevirtual   #132 <Method cn.com.fmsh.communication.message.core.Tag MessageHandler.createTag(byte[])>
	//   14   36:areturn         
		else
			return null;
	//   15   37:aconst_null     
	//   16   38:areturn         
	}

	public ITag toTag4A3()
		throws FMCommunicationMessageException
	{
		MessageHandler messagehandler = MessageHandleFactory.getMessageHandler();
	//    0    0:invokestatic    #126 <Method MessageHandler MessageHandleFactory.getMessageHandler()>
	//    1    3:astore_1        
		cn.com.fmsh.communication.message.core.Tag tag = messagehandler.createTag((byte)-93);
	//    2    4:aload_1         
	//    3    5:bipush          -93
	//    4    7:invokevirtual   #137 <Method cn.com.fmsh.communication.message.core.Tag MessageHandler.createTag(byte)>
	//    5   10:astore_2        
		for(Iterator iterator = list.iterator(); iterator.hasNext();)
	//*   6   11:aload_0         
	//*   7   12:getfield        #16  <Field List list>
	//*   8   15:invokeinterface #89  <Method Iterator List.iterator()>
	//*   9   20:astore_3        
	//*  10   21:goto            56
		{
			ApduResponse apduresponse = (ApduResponse)iterator.next();
	//   11   24:aload_3         
	//   12   25:invokeinterface #95  <Method Object Iterator.next()>
	//   13   30:checkcast       #29  <Class ApduResponse>
	//   14   33:astore          4
			if(apduresponse != null)
	//*  15   35:aload           4
	//*  16   37:ifnull          56
				((ITag) (tag)).addValue(((ITag) (messagehandler.createTag(apduresponse.toBytes()))));
	//   17   40:aload_2         
	//   18   41:aload_1         
	//   19   42:aload           4
	//   20   44:invokevirtual   #112 <Method byte[] ApduResponse.toBytes()>
	//   21   47:invokevirtual   #132 <Method cn.com.fmsh.communication.message.core.Tag MessageHandler.createTag(byte[])>
	//   22   50:invokeinterface #143 <Method int ITag.addValue(ITag)>
	//   23   55:pop             
		}

	//   24   56:aload_3         
	//   25   57:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   26   62:ifne            24
		return ((ITag) (tag));
	//   27   65:aload_2         
	//   28   66:areturn         
	}

	private List list;
}
