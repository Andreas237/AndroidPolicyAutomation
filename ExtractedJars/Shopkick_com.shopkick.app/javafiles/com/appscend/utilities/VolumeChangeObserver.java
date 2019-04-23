// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

// Referenced classes of package com.appscend.utilities:
//			VolumeChangedInterface

public class VolumeChangeObserver extends ContentObserver
{

	public VolumeChangeObserver(Context context, Handler handler, VolumeChangedInterface volumechangedinterface)
	{
		super(handler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void ContentObserver(Handler)>
		audioManager = (AudioManager)context.getSystemService("audio");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #17  <String "audio">
	//    6    9:invokevirtual   #23  <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #25  <Class AudioManager>
	//    8   15:putfield        #27  <Field AudioManager audioManager>
		previousVolume = audioManager.getStreamVolume(3);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #27  <Field AudioManager audioManager>
	//   12   23:iconst_3        
	//   13   24:invokevirtual   #31  <Method int AudioManager.getStreamVolume(int)>
	//   14   27:putfield        #33  <Field int previousVolume>
		volumeChangedInterface = volumechangedinterface;
	//   15   30:aload_0         
	//   16   31:aload_3         
	//   17   32:putfield        #35  <Field VolumeChangedInterface volumeChangedInterface>
	//   18   35:return          
	}

	public boolean deliverSelfNotifications()
	{
		return super.deliverSelfNotifications();
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method boolean ContentObserver.deliverSelfNotifications()>
	//    2    4:ireturn         
	}

	public void onChange(boolean flag)
	{
		super.onChange(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #44  <Method void ContentObserver.onChange(boolean)>
		int i = audioManager.getStreamVolume(3);
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field AudioManager audioManager>
	//    5    9:iconst_3        
	//    6   10:invokevirtual   #31  <Method int AudioManager.getStreamVolume(int)>
	//    7   13:istore_2        
		if(previousVolume - i != 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #33  <Field int previousVolume>
	//*  10   18:iload_2         
	//*  11   19:isub            
	//*  12   20:ifeq            41
		{
			previousVolume = i;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #33  <Field int previousVolume>
			volumeChangedInterface.volumeChanged(previousVolume);
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field VolumeChangedInterface volumeChangedInterface>
	//   18   32:aload_0         
	//   19   33:getfield        #33  <Field int previousVolume>
	//   20   36:invokeinterface #50  <Method void VolumeChangedInterface.volumeChanged(int)>
		}
	//   21   41:return          
	}

	AudioManager audioManager;
	int previousVolume;
	VolumeChangedInterface volumeChangedInterface;
}
