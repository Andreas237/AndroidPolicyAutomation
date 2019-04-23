// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;

public abstract class MediaRouteProvider$RouteController
{

	public boolean onControlRequest(Intent intent, MediaRouter$ControlRequestCallback mediarouter$controlrequestcallback)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onRelease()
	{
	//    0    0:return          
	}

	public void onSelect()
	{
	//    0    0:return          
	}

	public void onSetVolume(int i)
	{
	//    0    0:return          
	}

	public void onUnselect()
	{
	//    0    0:return          
	}

	public void onUnselect(int i)
	{
		onUnselect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method void onUnselect()>
	//    2    4:return          
	}

	public void onUpdateVolume(int i)
	{
	//    0    0:return          
	}

	public MediaRouteProvider$RouteController()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}
}
