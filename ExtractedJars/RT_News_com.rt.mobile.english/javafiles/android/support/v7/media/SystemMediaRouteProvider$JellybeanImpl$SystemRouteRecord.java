// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider, MediaRouteDescriptor

protected static final class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord
{

	public MediaRouteDescriptor mRouteDescriptor;
	public final String mRouteDescriptorId;
	public final Object mRouteObj;

	public SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord(Object obj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mRouteObj = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Object mRouteObj>
		mRouteDescriptorId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String mRouteDescriptorId>
	//    8   14:return          
	}
}
