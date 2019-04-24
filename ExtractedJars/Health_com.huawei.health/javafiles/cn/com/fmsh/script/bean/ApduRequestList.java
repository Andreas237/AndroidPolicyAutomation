// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.script.bean;

import cn.com.fmsh.communication.message.ITag;
import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.script.exception.FMScriptHandleException;
import cn.com.fmsh.util.log.FMLog;
import cn.com.fmsh.util.log.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.*;

// Referenced classes of package cn.com.fmsh.script.bean:
//			ApduRequest

public class ApduRequestList
{

	public ApduRequestList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		log = LogFactory.getInstance().getLog();
	//    2    4:aload_0         
	//    3    5:invokestatic    #23  <Method LogFactory LogFactory.getInstance()>
	//    4    8:invokevirtual   #27  <Method FMLog LogFactory.getLog()>
	//    5   11:putfield        #29  <Field FMLog log>
	//    6   14:aload_0         
	//    7   15:ldc1            #31  <String "ApduRequest">
	//    8   17:putfield        #33  <Field String logTag>
	//    9   20:aload_0         
	//   10   21:iconst_1        
	//   11   22:putfield        #35  <Field int FIRST_COMMAND_ID>
		list = ((Map) (new HashMap()));
	//   12   25:aload_0         
	//   13   26:new             #37  <Class HashMap>
	//   14   29:dup             
	//   15   30:invokespecial   #38  <Method void HashMap()>
	//   16   33:putfield        #40  <Field Map list>
	//   17   36:return          
	}

	private void multipleHandle(byte abyte0[])
		throws IOException
	{
		abyte0 = ((byte []) (new ByteArrayInputStream(abyte0)));
	//    0    0:new             #47  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #49  <Method void ByteArrayInputStream(byte[])>
	//    4    8:astore_1        
		do
		{
			int k;
			ApduRequest apdurequest;
			do
			{
				apdurequest = new ApduRequest();
	//    5    9:new             #51  <Class ApduRequest>
	//    6   12:dup             
	//    7   13:invokespecial   #52  <Method void ApduRequest()>
	//    8   16:astore          4
				int i = ((ByteArrayInputStream) (abyte0)).read();
	//    9   18:aload_1         
	//   10   19:invokevirtual   #56  <Method int ByteArrayInputStream.read()>
	//   11   22:istore_2        
				if(i == -1)
	//*  12   23:iload_2         
	//*  13   24:iconst_m1       
	//*  14   25:icmpne          29
					return;
	//   15   28:return          
				apdurequest.setId(i);
	//   16   29:aload           4
	//   17   31:iload_2         
	//   18   32:invokevirtual   #60  <Method void ApduRequest.setId(int)>
				i = ((ByteArrayInputStream) (abyte0)).read();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #56  <Method int ByteArrayInputStream.read()>
	//   21   39:istore_2        
				if(i == -1)
	//*  22   40:iload_2         
	//*  23   41:iconst_m1       
	//*  24   42:icmpne          46
					return;
	//   25   45:return          
				byte abyte1[] = new byte[i];
	//   26   46:iload_2         
	//   27   47:newarray        byte[]
	//   28   49:astore          5
				if(((ByteArrayInputStream) (abyte0)).read(abyte1) == -1)
	//*  29   51:aload_1         
	//*  30   52:aload           5
	//*  31   54:invokevirtual   #63  <Method int ByteArrayInputStream.read(byte[])>
	//*  32   57:iconst_m1       
	//*  33   58:icmpne          62
					return;
	//   34   61:return          
				apdurequest.setApdu(abyte1);
	//   35   62:aload           4
	//   36   64:aload           5
	//   37   66:invokevirtual   #66  <Method void ApduRequest.setApdu(byte[])>
				k = ((ByteArrayInputStream) (abyte0)).read();
	//   38   69:aload_1         
	//   39   70:invokevirtual   #56  <Method int ByteArrayInputStream.read()>
	//   40   73:istore_3        
				if(k == -1)
	//*  41   74:iload_3         
	//*  42   75:iconst_m1       
	//*  43   76:icmpne          80
					return;
	//   44   79:return          
			} while(k <= 1);
	//   45   80:iload_3         
	//   46   81:iconst_1        
	//   47   82:icmple          9
			for(int j = 0; j < k; j++)
	//*  48   85:iconst_0        
	//*  49   86:istore_2        
	//*  50   87:goto            114
			{
				byte abyte2[] = new byte[3];
	//   51   90:iconst_3        
	//   52   91:newarray        byte[]
	//   53   93:astore          5
				((ByteArrayInputStream) (abyte0)).read(abyte2);
	//   54   95:aload_1         
	//   55   96:aload           5
	//   56   98:invokevirtual   #63  <Method int ByteArrayInputStream.read(byte[])>
	//   57  101:pop             
				apdurequest.addExpectationAndNext(abyte2);
	//   58  102:aload           4
	//   59  104:aload           5
	//   60  106:invokevirtual   #70  <Method boolean ApduRequest.addExpectationAndNext(byte[])>
	//   61  109:pop             
			}

	//   62  110:iload_2         
	//   63  111:iconst_1        
	//   64  112:iadd            
	//   65  113:istore_2        
	//   66  114:iload_2         
	//   67  115:iload_3         
	//   68  116:icmplt          90
		} while(true);
	//   69  119:goto            9
	}

	private void multipleHandle(ITag aitag[], ApduRequest apdurequest)
		throws FMCommunicationMessageException
	{
		int j = aitag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore_3        
	//*   5    6:goto            112
		{
			ITag itag = aitag[i];
	//    6    9:aload_1         
	//    7   10:iload_3         
	//    8   11:aaload          
	//    9   12:astore          5
			switch(itag.getId())
	//*  10   14:aload           5
	//*  11   16:invokeinterface #80  <Method byte ITag.getId()>
			{
			case 58: // ':'
			case 59: // ';'
			default:
				break;

	//*  12   21:tableswitch     56 60: default 56
	//	               56 59
	//	               57 73
	//	               58 108
	//	               59 108
	//	               60 87
	//*  13   56:goto            108
			case 56: // '8'
				apdurequest.setId(itag.getIntVal());
	//   14   59:aload_2         
	//   15   60:aload           5
	//   16   62:invokeinterface #83  <Method int ITag.getIntVal()>
	//   17   67:invokevirtual   #60  <Method void ApduRequest.setId(int)>
				break;
	//   18   70:goto            108

			case 57: // '9'
				apdurequest.setApdu(itag.getBytesVal());
	//   19   73:aload_2         
	//   20   74:aload           5
	//   21   76:invokeinterface #87  <Method byte[] ITag.getBytesVal()>
	//   22   81:invokevirtual   #66  <Method void ApduRequest.setApdu(byte[])>
				break;
	//   23   84:goto            108

			case 60: // '<'
				byte abyte0[] = itag.getBytesVal();
	//   24   87:aload           5
	//   25   89:invokeinterface #87  <Method byte[] ITag.getBytesVal()>
	//   26   94:astore          5
				if(abyte0 != null)
	//*  27   96:aload           5
	//*  28   98:ifnull          108
					apdurequest.addExpectationAndNext(abyte0);
	//   29  101:aload_2         
	//   30  102:aload           5
	//   31  104:invokevirtual   #70  <Method boolean ApduRequest.addExpectationAndNext(byte[])>
	//   32  107:pop             
				break;
			}
		}

	//   33  108:iload_3         
	//   34  109:iconst_1        
	//   35  110:iadd            
	//   36  111:istore_3        
	//   37  112:iload_3         
	//   38  113:iload           4
	//   39  115:icmplt          9
	//   40  118:return          
	}

	private void singleHandle(byte abyte0[], ApduRequest apdurequest)
	{
		apdurequest.setId(((int) (abyte0[0])));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:baload          
	//    4    4:invokevirtual   #60  <Method void ApduRequest.setId(int)>
		apdurequest.setApdu(Arrays.copyOfRange(abyte0, 1, abyte0.length - 2));
	//    5    7:aload_2         
	//    6    8:aload_1         
	//    7    9:iconst_1        
	//    8   10:aload_1         
	//    9   11:arraylength     
	//   10   12:iconst_2        
	//   11   13:isub            
	//   12   14:invokestatic    #95  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   13   17:invokevirtual   #66  <Method void ApduRequest.setApdu(byte[])>
		abyte0 = Arrays.copyOfRange(abyte0, abyte0.length - 2, abyte0.length);
	//   14   20:aload_1         
	//   15   21:aload_1         
	//   16   22:arraylength     
	//   17   23:iconst_2        
	//   18   24:isub            
	//   19   25:aload_1         
	//   20   26:arraylength     
	//   21   27:invokestatic    #95  <Method byte[] Arrays.copyOfRange(byte[], int, int)>
	//   22   30:astore_1        
		apdurequest.addExpectationAndNext(new byte[] {
			abyte0[0], abyte0[1], 0
		});
	//   23   31:aload_2         
	//   24   32:iconst_3        
	//   25   33:newarray        byte[]
	//   26   35:dup             
	//   27   36:iconst_0        
	//   28   37:aload_1         
	//   29   38:iconst_0        
	//   30   39:baload          
	//   31   40:bastore         
	//   32   41:dup             
	//   33   42:iconst_1        
	//   34   43:aload_1         
	//   35   44:iconst_1        
	//   36   45:baload          
	//   37   46:bastore         
	//   38   47:dup             
	//   39   48:iconst_2        
	//   40   49:iconst_0        
	//   41   50:bastore         
	//   42   51:invokevirtual   #70  <Method boolean ApduRequest.addExpectationAndNext(byte[])>
	//   43   54:pop             
	//   44   55:return          
	}

	public boolean add(ApduRequest apdurequest)
		throws FMScriptHandleException
	{
		if(apdurequest == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(list.size() < 1 && 1 != apdurequest.getId())
	//*   4    6:aload_0         
	//*   5    7:getfield        #40  <Field Map list>
	//*   6   10:invokeinterface #104 <Method int Map.size()>
	//*   7   15:iconst_1        
	//*   8   16:icmpge          37
	//*   9   19:iconst_1        
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #106 <Method int ApduRequest.getId()>
	//*  12   24:icmpeq          37
		{
			throw new FMScriptHandleException("\u5F85\u6267\u884C\u7684\u7B2C\u4E00\u6761\u6307\u4EE4\u7684\u5E8F\u5217\u53F7\u4E0D\u662F1\uFF0C\u590D\u5408\u811A\u672C\u5904\u7406\u5931\u8D25");
	//   13   27:new             #99  <Class FMScriptHandleException>
	//   14   30:dup             
	//   15   31:ldc1            #108 <String "\u5F85\u6267\u884C\u7684\u7B2C\u4E00\u6761\u6307\u4EE4\u7684\u5E8F\u5217\u53F7\u4E0D\u662F1\uFF0C\u590D\u5408\u811A\u672C\u5904\u7406\u5931\u8D25">
	//   16   33:invokespecial   #111 <Method void FMScriptHandleException(String)>
	//   17   36:athrow          
		} else
		{
			list.put(((Object) (Integer.valueOf(apdurequest.getId()))), ((Object) (apdurequest)));
	//   18   37:aload_0         
	//   19   38:getfield        #40  <Field Map list>
	//   20   41:aload_1         
	//   21   42:invokevirtual   #106 <Method int ApduRequest.getId()>
	//   22   45:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//   23   48:aload_1         
	//   24   49:invokeinterface #121 <Method Object Map.put(Object, Object)>
	//   25   54:pop             
			return true;
	//   26   55:iconst_1        
	//   27   56:ireturn         
		}
	}

	public void clear()
	{
		list.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map list>
	//    2    4:invokeinterface #124 <Method void Map.clear()>
	//    3    9:return          
	}

	public void fromTag(ITag itag)
		throws FMCommunicationMessageException, FMScriptHandleException
	{
		if(itag == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new FMCommunicationMessageException("TAG\u8F6C\u6362\u4E3A\u6307\u4EE4\u96C6\u5408\u65F6\uFF0CTAG\u4E3A\u7A7A");
	//    2    4:new             #74  <Class FMCommunicationMessageException>
	//    3    7:dup             
	//    4    8:ldc1            #128 <String "TAG\u8F6C\u6362\u4E3A\u6307\u4EE4\u96C6\u5408\u65F6\uFF0CTAG\u4E3A\u7A7A">
	//    5   10:invokespecial   #129 <Method void FMCommunicationMessageException(String)>
	//    6   13:athrow          
		byte byte0 = itag.getId();
	//    7   14:aload_1         
	//    8   15:invokeinterface #80  <Method byte ITag.getId()>
	//    9   20:istore_2        
		if(!itag.isValid())
	//*  10   21:aload_1         
	//*  11   22:invokeinterface #133 <Method boolean ITag.isValid()>
	//*  12   27:ifne            59
			throw new FMCommunicationMessageException(String.format("\u6839\u636E\u89E3\u6790\u5DE5\u5177\u63D0\u4F9B\u7684TAG[%X]\u89E3\u6790\u8BF7\u6C42\u6307\u4EE4\u65F6\uFF0CTAG\u65E0\u6548", new Object[] {
				Byte.valueOf(itag.getId())
			}));
	//   13   30:new             #74  <Class FMCommunicationMessageException>
	//   14   33:dup             
	//   15   34:ldc1            #135 <String "\u6839\u636E\u89E3\u6790\u5DE5\u5177\u63D0\u4F9B\u7684TAG[%X]\u89E3\u6790\u8BF7\u6C42\u6307\u4EE4\u65F6\uFF0CTAG\u65E0\u6548">
	//   16   36:iconst_1        
	//   17   37:anewarray       Object[]
	//   18   40:dup             
	//   19   41:iconst_0        
	//   20   42:aload_1         
	//   21   43:invokeinterface #80  <Method byte ITag.getId()>
	//   22   48:invokestatic    #140 <Method Byte Byte.valueOf(byte)>
	//   23   51:aastore         
	//   24   52:invokestatic    #146 <Method String String.format(String, Object[])>
	//   25   55:invokespecial   #129 <Method void FMCommunicationMessageException(String)>
	//   26   58:athrow          
		if(byte0 == -95)
	//*  27   59:iload_2         
	//*  28   60:bipush          -95
	//*  29   62:icmpne          210
		{
			int j = itag.getItemCount();
	//   30   65:aload_1         
	//   31   66:invokeinterface #149 <Method int ITag.getItemCount()>
	//   32   71:istore          4
			for(int i = 0; i < j; i++)
	//*  33   73:iconst_0        
	//*  34   74:istore_3        
	//*  35   75:goto            203
			{
				ITag itag1 = itag.getItemTagVal(i);
	//   36   78:aload_1         
	//   37   79:iload_3         
	//   38   80:invokeinterface #153 <Method ITag ITag.getItemTagVal(int)>
	//   39   85:astore          5
				if(itag1 != null)
	//*  40   87:aload           5
	//*  41   89:ifnull          199
				{
					ApduRequest apdurequest1 = new ApduRequest();
	//   42   92:new             #51  <Class ApduRequest>
	//   43   95:dup             
	//   44   96:invokespecial   #52  <Method void ApduRequest()>
	//   45   99:astore          6
					byte0 = itag1.getId();
	//   46  101:aload           5
	//   47  103:invokeinterface #80  <Method byte ITag.getId()>
	//   48  108:istore_2        
					apdurequest1.setTag(byte0);
	//   49  109:aload           6
	//   50  111:iload_2         
	//   51  112:invokevirtual   #157 <Method void ApduRequest.setTag(byte)>
					if(byte0 == -92)
	//*  52  115:iload_2         
	//*  53  116:bipush          -92
	//*  54  118:icmpne          137
						multipleHandle(itag1.getItemTags(), apdurequest1);
	//   55  121:aload_0         
	//   56  122:aload           5
	//   57  124:invokeinterface #161 <Method ITag[] ITag.getItemTags()>
	//   58  129:aload           6
	//   59  131:invokespecial   #163 <Method void multipleHandle(ITag[], ApduRequest)>
					else
	//*  60  134:goto            192
					if(byte0 == -96)
	//*  61  137:iload_2         
	//*  62  138:bipush          -96
	//*  63  140:icmpne          159
					{
						singleHandle(itag1.getBytesVal(), apdurequest1);
	//   64  143:aload_0         
	//   65  144:aload           5
	//   66  146:invokeinterface #87  <Method byte[] ITag.getBytesVal()>
	//   67  151:aload           6
	//   68  153:invokespecial   #165 <Method void singleHandle(byte[], ApduRequest)>
					} else
	//*  69  156:goto            192
					{
						list.clear();
	//   70  159:aload_0         
	//   71  160:getfield        #40  <Field Map list>
	//   72  163:invokeinterface #124 <Method void Map.clear()>
						throw new FMCommunicationMessageException(String.format("A1\u540E\u9762\u53EA\u80FD\u662FA0\u6216\u8005A4\uFF0C\u8BE5Tag[%X]\u65E0\u6548", new Object[] {
							Byte.valueOf(byte0)
						}));
	//   73  168:new             #74  <Class FMCommunicationMessageException>
	//   74  171:dup             
	//   75  172:ldc1            #167 <String "A1\u540E\u9762\u53EA\u80FD\u662FA0\u6216\u8005A4\uFF0C\u8BE5Tag[%X]\u65E0\u6548">
	//   76  174:iconst_1        
	//   77  175:anewarray       Object[]
	//   78  178:dup             
	//   79  179:iconst_0        
	//   80  180:iload_2         
	//   81  181:invokestatic    #140 <Method Byte Byte.valueOf(byte)>
	//   82  184:aastore         
	//   83  185:invokestatic    #146 <Method String String.format(String, Object[])>
	//   84  188:invokespecial   #129 <Method void FMCommunicationMessageException(String)>
	//   85  191:athrow          
					}
					add(apdurequest1);
	//   86  192:aload_0         
	//   87  193:aload           6
	//   88  195:invokevirtual   #169 <Method boolean add(ApduRequest)>
	//   89  198:pop             
				}
			}

	//   90  199:iload_3         
	//   91  200:iconst_1        
	//   92  201:iadd            
	//   93  202:istore_3        
	//   94  203:iload_3         
	//   95  204:iload           4
	//   96  206:icmplt          78
			return;
	//   97  209:return          
		}
		if(byte0 == -96)
	//*  98  210:iload_2         
	//*  99  211:bipush          -96
	//* 100  213:icmpne          251
		{
			ApduRequest apdurequest = new ApduRequest();
	//  101  216:new             #51  <Class ApduRequest>
	//  102  219:dup             
	//  103  220:invokespecial   #52  <Method void ApduRequest()>
	//  104  223:astore          5
			apdurequest.setTag(byte0);
	//  105  225:aload           5
	//  106  227:iload_2         
	//  107  228:invokevirtual   #157 <Method void ApduRequest.setTag(byte)>
			singleHandle(itag.getBytesVal(), apdurequest);
	//  108  231:aload_0         
	//  109  232:aload_1         
	//  110  233:invokeinterface #87  <Method byte[] ITag.getBytesVal()>
	//  111  238:aload           5
	//  112  240:invokespecial   #165 <Method void singleHandle(byte[], ApduRequest)>
			add(apdurequest);
	//  113  243:aload_0         
	//  114  244:aload           5
	//  115  246:invokevirtual   #169 <Method boolean add(ApduRequest)>
	//  116  249:pop             
			return;
	//  117  250:return          
		} else
		{
			throw new FMCommunicationMessageException(String.format("A0\u6216\u8005A1\u624D\u80FD\u8F6C\u6362\u4E3A\u4E0B\u53D1\u811A\u672C\uFF0CTAG[%X]\u65E0\u6548", new Object[] {
				Byte.valueOf(byte0)
			}));
	//  118  251:new             #74  <Class FMCommunicationMessageException>
	//  119  254:dup             
	//  120  255:ldc1            #171 <String "A0\u6216\u8005A1\u624D\u80FD\u8F6C\u6362\u4E3A\u4E0B\u53D1\u811A\u672C\uFF0CTAG[%X]\u65E0\u6548">
	//  121  257:iconst_1        
	//  122  258:anewarray       Object[]
	//  123  261:dup             
	//  124  262:iconst_0        
	//  125  263:iload_2         
	//  126  264:invokestatic    #140 <Method Byte Byte.valueOf(byte)>
	//  127  267:aastore         
	//  128  268:invokestatic    #146 <Method String String.format(String, Object[])>
	//  129  271:invokespecial   #129 <Method void FMCommunicationMessageException(String)>
	//  130  274:athrow          
		}
	}

	public ApduRequest getApduRequest(int i)
	{
		return (ApduRequest)list.get(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map list>
	//    2    4:iload_1         
	//    3    5:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #177 <Method Object Map.get(Object)>
	//    5   13:checkcast       #51  <Class ApduRequest>
	//    6   16:areturn         
	}

	public ApduRequest[] getApduRequests()
	{
		ApduRequest aapdurequest[] = new ApduRequest[list.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map list>
	//    2    4:invokeinterface #104 <Method int Map.size()>
	//    3    9:anewarray       ApduRequest[]
	//    4   12:astore_2        
		Iterator iterator = list.keySet().iterator();
	//    5   13:aload_0         
	//    6   14:getfield        #40  <Field Map list>
	//    7   17:invokeinterface #183 <Method Set Map.keySet()>
	//    8   22:invokeinterface #189 <Method Iterator Set.iterator()>
	//    9   27:astore_3        
		for(int i = 0; iterator.hasNext(); i++)
	//*  10   28:iconst_0        
	//*  11   29:istore_1        
	//*  12   30:goto            58
			aapdurequest[i] = (ApduRequest)list.get(iterator.next());
	//   13   33:aload_2         
	//   14   34:iload_1         
	//   15   35:aload_0         
	//   16   36:getfield        #40  <Field Map list>
	//   17   39:aload_3         
	//   18   40:invokeinterface #195 <Method Object Iterator.next()>
	//   19   45:invokeinterface #177 <Method Object Map.get(Object)>
	//   20   50:checkcast       #51  <Class ApduRequest>
	//   21   53:aastore         

	//   22   54:iload_1         
	//   23   55:iconst_1        
	//   24   56:iadd            
	//   25   57:istore_1        
	//   26   58:aload_3         
	//   27   59:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   28   64:ifne            33
		return aapdurequest;
	//   29   67:aload_2         
	//   30   68:areturn         
	}

	public List getApdus()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #202 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #203 <Method void ArrayList()>
	//    3    7:astore_1        
		for(Iterator iterator = list.keySet().iterator(); iterator.hasNext();)
	//*   4    8:aload_0         
	//*   5    9:getfield        #40  <Field Map list>
	//*   6   12:invokeinterface #183 <Method Set Map.keySet()>
	//*   7   17:invokeinterface #189 <Method Iterator Set.iterator()>
	//*   8   22:astore_2        
	//*   9   23:goto            60
		{
			ApduRequest apdurequest = (ApduRequest)list.get(iterator.next());
	//   10   26:aload_0         
	//   11   27:getfield        #40  <Field Map list>
	//   12   30:aload_2         
	//   13   31:invokeinterface #195 <Method Object Iterator.next()>
	//   14   36:invokeinterface #177 <Method Object Map.get(Object)>
	//   15   41:checkcast       #51  <Class ApduRequest>
	//   16   44:astore_3        
			if(apdurequest != null)
	//*  17   45:aload_3         
	//*  18   46:ifnull          60
				((List) (arraylist)).add(((Object) (apdurequest.getApdu())));
	//   19   49:aload_1         
	//   20   50:aload_3         
	//   21   51:invokevirtual   #206 <Method byte[] ApduRequest.getApdu()>
	//   22   54:invokeinterface #211 <Method boolean List.add(Object)>
	//   23   59:pop             
		}

	//   24   60:aload_2         
	//   25   61:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   26   66:ifne            26
		return ((List) (arraylist));
	//   27   69:aload_1         
	//   28   70:areturn         
	}

	public ApduRequest getFirstApduRequest()
	{
		return (ApduRequest)list.get(((Object) (Integer.valueOf(1))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map list>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #117 <Method Integer Integer.valueOf(int)>
	//    4    8:invokeinterface #177 <Method Object Map.get(Object)>
	//    5   13:checkcast       #51  <Class ApduRequest>
	//    6   16:areturn         
	}

	public int size()
	{
		return list.size();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Map list>
	//    2    4:invokeinterface #104 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public byte[] toBytes()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final int FIRST_COMMAND_ID = 1;
	private Map list;
	private FMLog log;
	private final String logTag = "ApduRequest";
}
