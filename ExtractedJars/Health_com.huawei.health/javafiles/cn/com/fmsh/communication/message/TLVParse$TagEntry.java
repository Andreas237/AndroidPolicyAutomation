// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.communication.message;


// Referenced classes of package cn.com.fmsh.communication.message:
//			TLVParse

public class TLVParse$TagEntry
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

	public TLVParse$TagEntry(byte abyte0[], byte abyte1[], byte abyte2[])
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
