// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			TransportMediatorJellybeanMR2

class TransportMediatorJellybeanMR2$1
	implements android.view.istener
{

	public void onWindowAttached()
	{
		windowAttached();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
	//    2    4:invokevirtual   #22  <Method void TransportMediatorJellybeanMR2.windowAttached()>
	//    3    7:return          
	}

	public void onWindowDetached()
	{
		windowDetached();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
	//    2    4:invokevirtual   #26  <Method void TransportMediatorJellybeanMR2.windowDetached()>
	//    3    7:return          
	}

	final TransportMediatorJellybeanMR2 this$0;

	TransportMediatorJellybeanMR2$1()
	{
		this$0 = TransportMediatorJellybeanMR2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
