// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			TransportMediatorJellybeanMR2

class TransportMediatorJellybeanMR2$2
	implements android.view.angeListener
{

	public void onWindowFocusChanged(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
		{
			gainFocus();
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
	//    4    8:invokevirtual   #23  <Method void TransportMediatorJellybeanMR2.gainFocus()>
			return;
	//    5   11:return          
		} else
		{
			loseFocus();
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field TransportMediatorJellybeanMR2 this$0>
	//    8   16:invokevirtual   #26  <Method void TransportMediatorJellybeanMR2.loseFocus()>
			return;
	//    9   19:return          
		}
	}

	final TransportMediatorJellybeanMR2 this$0;

	TransportMediatorJellybeanMR2$2()
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
