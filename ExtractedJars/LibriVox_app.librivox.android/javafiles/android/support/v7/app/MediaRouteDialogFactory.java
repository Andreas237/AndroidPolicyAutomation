// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//			MediaRouteChooserDialogFragment, MediaRouteControllerDialogFragment

public class MediaRouteDialogFactory
{

	public MediaRouteDialogFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static MediaRouteDialogFactory getDefault()
	{
		return sDefault;
	//    0    0:getstatic       #13  <Field MediaRouteDialogFactory sDefault>
	//    1    3:areturn         
	}

	public MediaRouteChooserDialogFragment onCreateChooserDialogFragment()
	{
		return new MediaRouteChooserDialogFragment();
	//    0    0:new             #21  <Class MediaRouteChooserDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void MediaRouteChooserDialogFragment()>
	//    3    7:areturn         
	}

	public MediaRouteControllerDialogFragment onCreateControllerDialogFragment()
	{
		return new MediaRouteControllerDialogFragment();
	//    0    0:new             #26  <Class MediaRouteControllerDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void MediaRouteControllerDialogFragment()>
	//    3    7:areturn         
	}

	private static final MediaRouteDialogFactory sDefault = new MediaRouteDialogFactory();

	static 
	{
	//    0    0:new             #2   <Class MediaRouteDialogFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #11  <Method void MediaRouteDialogFactory()>
	//    3    7:putstatic       #13  <Field MediaRouteDialogFactory sDefault>
	//*   4   10:return          
	}
}
