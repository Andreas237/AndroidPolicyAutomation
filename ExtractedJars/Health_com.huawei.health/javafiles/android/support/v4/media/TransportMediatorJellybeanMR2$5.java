// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			TransportMediatorJellybeanMR2, TransportMediatorCallback

class TransportMediatorJellybeanMR2$5
	implements android.media.kPositionListener
{

	public long onGetPlaybackPosition()
	{
		return mTransportCallback.getPlaybackPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
	//    2    4:getfield        #24  <Field TransportMediatorCallback TransportMediatorJellybeanMR2.mTransportCallback>
	//    3    7:invokeinterface #29  <Method long TransportMediatorCallback.getPlaybackPosition()>
	//    4   12:lreturn         
	}

	final TransportMediatorJellybeanMR2 this$0;

	TransportMediatorJellybeanMR2$5()
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
