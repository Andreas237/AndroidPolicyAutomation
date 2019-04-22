// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import com.google.android.gms.tasks.OnSuccessListener;

// Referenced classes of package bo.app:
//			ef

static final class ef$2
	implements OnSuccessListener
{

	public void a(Void void1)
	{
		AppboyLogger.d(ef.a(), "Geofences successfully registered with Google Play Services.");
	//    0    0:invokestatic    #22  <Method String ef.a()>
	//    1    3:ldc1            #24  <String "Geofences successfully registered with Google Play Services.">
	//    2    5:invokestatic    #30  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void onSuccess(Object obj)
	{
		a((Void)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #34  <Class Void>
	//    3    5:invokevirtual   #36  <Method void a(Void)>
	//    4    8:return          
	}

	ef$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
