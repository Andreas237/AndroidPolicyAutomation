// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.dvb;


// Referenced classes of package com.google.android.exoplayer2.text.dvb:
//			DvbParser

private static final class DvbParser$ObjectData
{

	public final byte bottomFieldData[];
	public final int id;
	public final boolean nonModifyingColorFlag;
	public final byte topFieldData[];

	public DvbParser$ObjectData(int i, boolean flag, byte abyte0[], byte abyte1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		id = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int id>
		nonModifyingColorFlag = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field boolean nonModifyingColorFlag>
		topFieldData = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field byte[] topFieldData>
		bottomFieldData = abyte1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #27  <Field byte[] bottomFieldData>
	//   14   25:return          
	}
}
