// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import java.io.*;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcelStream

private static class VersionedParcelStream$FieldBuffer
{

	void flushField()
		throws IOException
	{
		mDataStream.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field DataOutputStream mDataStream>
	//    2    4:invokevirtual   #42  <Method void DataOutputStream.flush()>
		int j = mOutput.size();
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field ByteArrayOutputStream mOutput>
	//    5   11:invokevirtual   #46  <Method int ByteArrayOutputStream.size()>
	//    6   14:istore_2        
		int k = mFieldId;
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field int mFieldId>
	//    9   19:istore_3        
		int i;
		if(j >= 65535)
	//*  10   20:iload_2         
	//*  11   21:ldc1            #47  <Int 65535>
	//*  12   23:icmplt          32
			i = 65535;
	//   13   26:ldc1            #47  <Int 65535>
	//   14   28:istore_1        
		else
	//*  15   29:goto            34
			i = j;
	//   16   32:iload_2         
	//   17   33:istore_1        
		mTarget.writeInt(k << 16 | i);
	//   18   34:aload_0         
	//   19   35:getfield        #35  <Field DataOutputStream mTarget>
	//   20   38:iload_3         
	//   21   39:bipush          16
	//   22   41:ishl            
	//   23   42:iload_1         
	//   24   43:ior             
	//   25   44:invokevirtual   #51  <Method void DataOutputStream.writeInt(int)>
		if(j >= 65535)
	//*  26   47:iload_2         
	//*  27   48:ldc1            #47  <Int 65535>
	//*  28   50:icmplt          61
			mTarget.writeInt(j);
	//   29   53:aload_0         
	//   30   54:getfield        #35  <Field DataOutputStream mTarget>
	//   31   57:iload_2         
	//   32   58:invokevirtual   #51  <Method void DataOutputStream.writeInt(int)>
		mOutput.writeTo(((java.io.OutputStream) (mTarget)));
	//   33   61:aload_0         
	//   34   62:getfield        #24  <Field ByteArrayOutputStream mOutput>
	//   35   65:aload_0         
	//   36   66:getfield        #35  <Field DataOutputStream mTarget>
	//   37   69:invokevirtual   #54  <Method void ByteArrayOutputStream.writeTo(java.io.OutputStream)>
	//   38   72:return          
	}

	final DataOutputStream mDataStream;
	private final int mFieldId;
	final ByteArrayOutputStream mOutput = new ByteArrayOutputStream();
	private final DataOutputStream mTarget;

	VersionedParcelStream$FieldBuffer(int i, DataOutputStream dataoutputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ByteArrayOutputStream()>
	//    6   12:putfield        #24  <Field ByteArrayOutputStream mOutput>
		mDataStream = new DataOutputStream(((java.io.OutputStream) (mOutput)));
	//    7   15:aload_0         
	//    8   16:new             #26  <Class DataOutputStream>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field ByteArrayOutputStream mOutput>
	//   12   24:invokespecial   #29  <Method void DataOutputStream(java.io.OutputStream)>
	//   13   27:putfield        #31  <Field DataOutputStream mDataStream>
		mFieldId = i;
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:putfield        #33  <Field int mFieldId>
		mTarget = dataoutputstream;
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:putfield        #35  <Field DataOutputStream mTarget>
	//   20   40:return          
	}
}
