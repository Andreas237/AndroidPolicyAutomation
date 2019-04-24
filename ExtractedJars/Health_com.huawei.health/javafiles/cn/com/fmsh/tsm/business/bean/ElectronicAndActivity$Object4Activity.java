// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;


// Referenced classes of package cn.com.fmsh.tsm.business.bean:
//			ElectronicAndActivity

public class ElectronicAndActivity$Object4Activity
{

	public byte activity[];
	final ElectronicAndActivity this$0;
	public byte ticketType[];

	public ElectronicAndActivity$Object4Activity(byte abyte0[], byte abyte1[])
	{
		this$0 = ElectronicAndActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ElectronicAndActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
		ticketType = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field byte[] ticketType>
		activity = abyte1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field byte[] activity>
	//   11   19:return          
	}
}
