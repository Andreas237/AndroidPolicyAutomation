// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;

import cn.com.fmsh.communication.message.exception.FMCommunicationMessageException;
import cn.com.fmsh.util.FM_Bytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TLVParse
{
	public class TagEntry
	{

		public byte[] getData()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field byte[] data>
		//    2    4:areturn         
		}

		public byte[] getLengthData()
		{
			return lengthData;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field byte[] lengthData>
		//    2    4:areturn         
		}

		public byte[] getTag()
		{
			return tag;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field byte[] tag>
		//    2    4:areturn         
		}

		private byte data[];
		private byte lengthData[];
		private byte tag[];
		final TLVParse this$0;

		public TagEntry(byte abyte0[], byte abyte1[], byte abyte2[])
		{
			this$0 = TLVParse.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TLVParse this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			tag = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field byte[] tag>
			lengthData = abyte1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field byte[] lengthData>
			data = abyte2;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #26  <Field byte[] data>
		//   14   25:return          
		}
	}


	public TLVParse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static TLVParse intance()
	{
		return new TLVParse();
	//    0    0:new             #2   <Class TLVParse>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void TLVParse()>
	//    3    7:areturn         
	}

	public static void main(String args[])
	{
		args = ((String []) (FM_Bytes.hexStringToBytes("A10100A206110100120101A30100")));
	//    0    0:ldc1            #21  <String "A10100A206110100120101A30100">
	//    1    2:invokestatic    #27  <Method byte[] FM_Bytes.hexStringToBytes(String)>
	//    2    5:astore_0        
		try
		{
			intance().parse(((byte []) (args)), 1);
	//    3    6:invokestatic    #29  <Method TLVParse intance()>
	//    4    9:aload_0         
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #33  <Method List parse(byte[], int)>
	//    7   14:pop             
			return;
	//    8   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(String args[])
	//*   9   16:astore_0        
		{
			((FMCommunicationMessageException) (args)).printStackTrace();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #36  <Method void FMCommunicationMessageException.printStackTrace()>
		}
	//   12   21:return          
	}

	public List parse(byte abyte0[], int i)
		throws FMCommunicationMessageException
	{
		ArrayList arraylist;
		ByteArrayInputStream bytearrayinputstream;
		byte abyte1[];
		arraylist = new ArrayList();
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ArrayList()>
	//    3    7:astore          5
		if(i < 1)
	//*   4    9:iload_2         
	//*   5   10:iconst_1        
	//*   6   11:icmpge          24
			throw new FMCommunicationMessageException("TLV\u6570\u636E\u89E3\u6790\u65F6\uFF0C\u4F20\u5165\u7684T\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5");
	//    7   14:new             #19  <Class FMCommunicationMessageException>
	//    8   17:dup             
	//    9   18:ldc1            #43  <String "TLV\u6570\u636E\u89E3\u6790\u65F6\uFF0C\u4F20\u5165\u7684T\u6570\u636E\u957F\u5EA6\u4E0D\u5408\u6CD5">
	//   10   20:invokespecial   #46  <Method void FMCommunicationMessageException(String)>
	//   11   23:athrow          
		if(abyte0 == null || abyte0.length < i + 1)
	//*  12   24:aload_1         
	//*  13   25:ifnull          36
	//*  14   28:aload_1         
	//*  15   29:arraylength     
	//*  16   30:iload_2         
	//*  17   31:iconst_1        
	//*  18   32:iadd            
	//*  19   33:icmpge          46
			throw new FMCommunicationMessageException("TLV\u6570\u636E\u89E3\u6790\u65F6\uFF0C\u4F20\u5165\u7684\u6570\u636E\u4E0D\u5408\u6CD5");
	//   20   36:new             #19  <Class FMCommunicationMessageException>
	//   21   39:dup             
	//   22   40:ldc1            #48  <String "TLV\u6570\u636E\u89E3\u6790\u65F6\uFF0C\u4F20\u5165\u7684\u6570\u636E\u4E0D\u5408\u6CD5">
	//   23   42:invokespecial   #46  <Method void FMCommunicationMessageException(String)>
	//   24   45:athrow          
		bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//   25   46:new             #50  <Class ByteArrayInputStream>
	//   26   49:dup             
	//   27   50:aload_1         
	//   28   51:invokespecial   #53  <Method void ByteArrayInputStream(byte[])>
	//   29   54:astore          6
		abyte1 = new byte[2];
	//   30   56:iconst_2        
	//   31   57:newarray        byte[]
	//   32   59:astore          7
_L1:
		byte abyte2[] = new byte[i];
	//   33   61:iload_2         
	//   34   62:newarray        byte[]
	//   35   64:astore          8
		int j;
		int k;
		byte abyte3[];
		try
		{
			j = bytearrayinputstream.read(abyte2);
	//   36   66:aload           6
	//   37   68:aload           8
	//   38   70:invokevirtual   #57  <Method int ByteArrayInputStream.read(byte[])>
	//   39   73:istore_3        
		}
	//*  40   74:iload_3         
	//*  41   75:iconst_m1       
	//*  42   76:icmpne          82
	//*  43   79:aload           5
	//*  44   81:areturn         
	//*  45   82:aload           6
	//*  46   84:invokevirtual   #60  <Method int ByteArrayInputStream.read()>
	//*  47   87:istore_3        
	//*  48   88:iload_3         
	//*  49   89:ifge            95
	//*  50   92:aload           5
	//*  51   94:areturn         
	//*  52   95:iload_3         
	//*  53   96:ifne            102
	//*  54   99:goto            61
	//*  55  102:iload_3         
	//*  56  103:sipush          255
	//*  57  106:icmpne          154
	//*  58  109:iconst_3        
	//*  59  110:newarray        byte[]
	//*  60  112:astore_1        
	//*  61  113:aload           6
	//*  62  115:aload           7
	//*  63  117:invokevirtual   #57  <Method int ByteArrayInputStream.read(byte[])>
	//*  64  120:istore          4
	//*  65  122:aload_1         
	//*  66  123:iconst_0        
	//*  67  124:iconst_0        
	//*  68  125:bastore         
	//*  69  126:aload_1         
	//*  70  127:iconst_1        
	//*  71  128:aload           7
	//*  72  130:iconst_0        
	//*  73  131:baload          
	//*  74  132:bastore         
	//*  75  133:aload_1         
	//*  76  134:iconst_2        
	//*  77  135:aload           7
	//*  78  137:iconst_1        
	//*  79  138:baload          
	//*  80  139:bastore         
	//*  81  140:aload_1         
	//*  82  141:invokestatic    #63  <Method int FM_Bytes.bytesToInt(byte[])>
	//*  83  144:istore_3        
	//*  84  145:iload           4
	//*  85  147:iconst_m1       
	//*  86  148:icmpne          163
	//*  87  151:aload           5
	//*  88  153:areturn         
	//*  89  154:iconst_1        
	//*  90  155:newarray        byte[]
	//*  91  157:astore_1        
	//*  92  158:aload_1         
	//*  93  159:iconst_0        
	//*  94  160:iload_3         
	//*  95  161:int2byte        
	//*  96  162:bastore         
	//*  97  163:iload_3         
	//*  98  164:newarray        byte[]
	//*  99  166:astore          9
	//* 100  168:aload           6
	//* 101  170:aload           9
	//* 102  172:invokevirtual   #57  <Method int ByteArrayInputStream.read(byte[])>
	//* 103  175:pop             
	//* 104  176:aload           5
	//* 105  178:new             #6   <Class TLVParse$TagEntry>
	//* 106  181:dup             
	//* 107  182:aload_0         
	//* 108  183:aload           8
	//* 109  185:aload_1         
	//* 110  186:aload           9
	//* 111  188:invokespecial   #66  <Method void TLVParse$TagEntry(TLVParse, byte[], byte[], byte[])>
	//* 112  191:invokeinterface #72  <Method boolean List.add(Object)>
	//* 113  196:pop             
	//* 114  197:goto            61
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//* 115  200:astore_1        
		{
			return ((List) (arraylist));
	//  116  201:aload           5
	//  117  203:areturn         
		}
		if(j == -1)
			return ((List) (arraylist));
		j = bytearrayinputstream.read();
		if(j < 0)
			return ((List) (arraylist));
		if(j != 0) goto _L2; else goto _L1
_L2:
		if(j != 255)
			break MISSING_BLOCK_LABEL_154;
		abyte0 = new byte[3];
		k = bytearrayinputstream.read(abyte1);
		abyte0[0] = 0;
		abyte0[1] = abyte1[0];
		abyte0[2] = abyte1[1];
		j = FM_Bytes.bytesToInt(abyte0);
		if(k == -1)
			return ((List) (arraylist));
		break MISSING_BLOCK_LABEL_163;
		abyte0 = new byte[1];
		abyte0[0] = (byte)j;
		abyte3 = new byte[j];
		bytearrayinputstream.read(abyte3);
		((List) (arraylist)).add(((Object) (new TagEntry(abyte2, abyte0, abyte3))));
		  goto _L1
	}
}
