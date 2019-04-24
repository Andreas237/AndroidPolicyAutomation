// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.core;


// Referenced classes of package cn.com.fmsh.tsm.business.core:
//			Configration

public class Configration$Key
{

	public byte exponent[];
	public int index;
	public byte modulus[];
	final Configration this$0;

	public Configration$Key()
	{
		this$0 = Configration.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Configration this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		index = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #23  <Field int index>
	//    8   14:return          
	}
}
